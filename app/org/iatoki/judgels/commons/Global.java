package org.iatoki.judgels.commons;

import play.GlobalSettings;
import play.api.mvc.EssentialFilter;
import play.filters.gzip.GzipFilter;
import play.filters.headers.SecurityHeadersFilter;

public abstract class Global extends GlobalSettings {

    @Override
    @SuppressWarnings("unchecked")
    public <T extends EssentialFilter> Class<T>[] filters() {
        return new Class[]{GzipFilter.class, SecurityHeadersFilter.class};
    }

}