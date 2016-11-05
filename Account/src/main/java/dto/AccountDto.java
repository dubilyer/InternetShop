package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ed_ao on 05.11.2016.
 */
public class AccountDto {
    @JsonProperty
    private long id;

    public AccountDto(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    private String name;

}
