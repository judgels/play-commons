package org.iatoki.judgels.commons.models.domains;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractJidCacheModel extends AbstractModel {
    @Id
    @GeneratedValue
    public long id;

    public String jid;

    public String displayName;
}