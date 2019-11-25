package com.lrn.pattern.flyweight;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/24 11:15 PM
 * @Version 1.0
 */
public class ExtrinsicState {

    private String subject;
    private String location;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  ExtrinsicState) {
            ExtrinsicState state = (ExtrinsicState)obj;
            return state.getLocation().equals(location) && state.getSubject().equals(subject);
        }
        return  false;
    }

    @Override
    public int hashCode() {
        return subject.hashCode() + location.hashCode();
    }
}
