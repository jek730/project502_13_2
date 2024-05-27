package org.choongang.templete.main;

import org.choongang.templete.Templete;

public class MainTpl implements Templete {
    @Override
    public String getTpl() {
        StringBuffer sb = new StringBuffer(2000);

        sb.append("메뉴를 선택하세요.\n")
                .append("1. 회원가입\n")
                .append("2. 로그인\n")
                .append("--------------------------------\n");

        return sb.toString();
    }
}