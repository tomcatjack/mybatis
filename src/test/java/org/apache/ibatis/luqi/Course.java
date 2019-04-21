package org.apache.ibatis.luqi;

public class Course {

  private String cid;
  private String name;
  private String tid;

  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  @Override
  public String toString() {
    return "Course{" +
        "cid='" + cid + '\'' +
        ", name='" + name + '\'' +
        ", tid='" + tid + '\'' +
        '}';
  }
}
