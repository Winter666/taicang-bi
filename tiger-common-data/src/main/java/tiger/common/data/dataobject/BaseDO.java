/**
 * 404 Studio Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package tiger.common.data.dataobject;

import java.sql.Timestamp;

/**
 * @author yiliang.gyl
 * @version $ID: v 0.1 10:11 AM yiliang.gyl Exp $
 */
public class BaseDO {

    private Long id;

    private Timestamp create_time;

    private Timestamp modify_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getModify_time() {
        return modify_time;
    }

    public void setModify_time(Timestamp modify_time) {
        this.modify_time = modify_time;
    }
}
