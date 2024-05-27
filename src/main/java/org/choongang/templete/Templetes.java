package org.choongang.templete;

import org.choongang.global.constants.Menu;
import org.choongang.templete.main.MainTpl;
import org.choongang.templete.member.JoinTpl;
import org.choongang.templete.member.LoginTpl;
import org.choongang.templete.member.MypageTpl;

import java.util.HashMap;
import java.util.Map;

public class Templetes {
    private static Templetes instance;
    private Map<Menu, Templete> tpls;

    private Templetes() {
        tpls = new HashMap<>();
    }

    public static Templetes getInstance() {
        if (instance == null) {
            instance = new Templetes();
        }

        return instance;
    }

    public void render(Menu menu) {
        System.out.println(find(menu).getTpl());
    }

    public Templete find(Menu menu) {
        Templete tpl = tpls.get(menu);
        if (tpl != null) {
            return tpl;
        }

        switch (menu) {
            case JOIN: tpl = new JoinTpl(); break;
            case LOGIN: tpl = new LoginTpl(); break;
            case MYPAGE: tpl = new MypageTpl(); break;
            default: tpl = new MainTpl();
        }

        tpls.put(menu, tpl);

        return tpl;
    }

    public String line() {
        return "-----------------------------------\n";
    }

    public String doubleLine() {
        return "===================================\n";
    }
}