package org.netbeans.gradle.javaee.web;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class GradleWebModuleInstall extends Yenta {
    private static final long serialVersionUID = 1L;

    private static final Set<String> FRIENDS = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
            "org.netbeans.modules.web.jsfapi")));

    @Override
    protected Set<String> friends() {
        return FRIENDS;
    }
}
