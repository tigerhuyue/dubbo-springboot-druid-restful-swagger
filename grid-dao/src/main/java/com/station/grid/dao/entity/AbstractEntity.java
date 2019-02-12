package com.station.grid.dao.entity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tiger on 2017/11/10.
 */

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
    public AbstractEntity() {
    }


}
