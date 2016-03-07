/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.base;

import java.io.Serializable;

/**
 * Created by Bongo on 16/3/8.
 */
public class BaseDomain implements Serializable{

    private static final long serialVersionUID = -3245660013973550587L;

    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

