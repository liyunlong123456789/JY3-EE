package com.neuedu.proxy;

public class ArgueProxy implements Argue {

    @Override
    public String talk()
    {

        ArguePerson arguePerson = new ArguePerson();
        String talk = arguePerson.talk();
        return talk.toUpperCase();
    }
}
