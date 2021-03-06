package org.sunshinelibrary.turtle.userdatamanager;

import com.squareup.tape.Task;

import java.io.Serializable;

/**
 * User: fxp
 * Date: 10/16/13
 * Time: 11:51 AM
 */
public class UserDataTask implements Serializable, Task {
    public String target;
    public String content;
    public String accessToken;

    public UserDataTask(String target, String content, String accessToken) {
        this.target = target;
        this.content = content;
        this.accessToken = accessToken;
    }

    @Override
    public void execute(Object o) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
