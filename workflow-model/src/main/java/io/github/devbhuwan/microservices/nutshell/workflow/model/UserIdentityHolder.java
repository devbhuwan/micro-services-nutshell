package io.github.devbhuwan.microservices.nutshell.workflow.model;

public final class UserIdentityHolder {

    private static final ThreadLocal<UserIdentity> userIdentityThreadLocal = new InheritableThreadLocal<>();

    public static void setUserIdentity(UserIdentity userIdentity) {
        userIdentityThreadLocal.set(userIdentity);
    }

    public static UserIdentity userIdentity() {
        return userIdentityThreadLocal.get();
    }

}
