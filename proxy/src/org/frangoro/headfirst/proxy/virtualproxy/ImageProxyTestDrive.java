package org.frangoro.headfirst.proxy.virtualproxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {

    ImageComponent imageComponet;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String, String> cds = new Hashtable<>();

    public static void main (String args[]) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {

        cds.put("Manolo Garcia", "http://media.laguiago.com/wp-content/uploads/2016/03/Manolo-Garcia-con-22Todo-es-ahora22-en-el-Auditorio-Municipal-de-Malaga.jpg");
        cds.put("Dover", "https://m.media-amazon.com/images/I/51C5I82YxFL._AC_UY218_ML3_.jpg");

        URL initialURL = new URL((String) cds.get("Dover"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDS");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration<String> e = cds.keys(); e.hasMoreElements();) {
            String name = e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(event -> {
                imageComponet.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                frame.repaint();
            });
        }

        Icon icon = new ImageProxy(initialURL);
        imageComponet = new ImageComponent(icon);
        frame.getContentPane().add(imageComponet);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

    private URL getCDUrl(String actionCommand) {
        try {
            return new URL((String)cds.get(actionCommand));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
