package javaio.xstream;

import java.sql.Date;

/**
 * Created by IntelliJ IDEA.<br>
 * <b>User</b>: leizhimin<br>
 * <b>Date</b>: 2008-5-22 21:10:32<br>
 * <b>Note</b>: Please add comment here!
 */
public class Profile
{
    private String job;

    private String tel;

    private String remark;

    public Profile(String job, String tel, String remark)
    {
        this.job = job;
        this.tel = tel;
        this.remark = remark;
    }

    public String toString()
    {
        return "Profile{" + "job='" + job + '\'' + ", tel='" + tel + '\'' + ", remark='"
                + remark + '\'' + '}';
    }
}
