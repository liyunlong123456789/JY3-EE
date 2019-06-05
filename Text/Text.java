package com.neuedu.Text;

import com.neuedu.proxy.Argue;
import com.neuedu.proxy.ArguePerson;
import com.neuedu.proxy.ArgueProxy;

public class Text {
    public static void main(String[] args) {
        Argue argue = new ArgueProxy();
        String talk = argue.talk();
        System.out.println(talk);

    }


}
