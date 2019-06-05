package com.neuedu.pojo;

public class Dept {

    private Integer id;
    private String name;
    private String leader;

    public Dept(Integer id, String name, String leader) {
        this.id = id;
        this.name = name;
        this.leader = leader;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", leader='" + leader + '\'' +
                '}';
    }
}
