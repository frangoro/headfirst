package org.frangoro.headfirst.proxy.protectionproxy;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

    public static void main(String[] args) {
        PersonBean pepe = new PersonBeanImpl();
        pepe.setName("Pepe");
        pepe.setGender("M");
        pepe.setInterests("Animals");
        pepe.setHotOrNotRating(5);

        PersonBean ownerProxy = getOwnerProxy(pepe);

        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling");
        System.out.println("Interests: " + ownerProxy.getInterests());
        try {

        ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("You cannot change your own rating");
        }
        System.out.println("Raring: " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(pepe);
        try {
            nonOwnerProxy.setInterests("basket");
        } catch (Exception e) {
            System.out.println("As non owner you cannot change your interests");
        }
        nonOwnerProxy.setHotOrNotRating(2);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }


    static PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    static PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
