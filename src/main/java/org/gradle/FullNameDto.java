package org.gradle;

public class FullNameDto {
    private String name;
    private String lastname;

    public FullNameDto(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "com.Info{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
