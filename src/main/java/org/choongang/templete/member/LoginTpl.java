package org.choongang.templete.member;

import org.choongang.templete.Templete;
import org.choongang.templete.Templetes;

public class LoginTpl implements Templete {
    @Override
    public String getTpl() {
        StringBuffer sb = new StringBuffer(1000);
        sb.append("로그인\n");
        sb.append("다음 로그인 항목을 입력하세요.\n");
        sb.append(Templetes.getInstance().line());

        return sb.toString();
    }
}