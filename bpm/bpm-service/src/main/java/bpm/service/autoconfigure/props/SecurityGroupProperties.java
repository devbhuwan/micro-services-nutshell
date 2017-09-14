package bpm.service.autoconfigure.props;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter
@Setter
public class SecurityGroupProperties {

    @NotNull
    private String groupId;
    @NotNull
    private String groupName;
    @NotNull
    private String groupType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecurityGroupProperties that = (SecurityGroupProperties) o;

        return groupId.equals(that.groupId);
    }

    @Override
    public int hashCode() {
        return groupId.hashCode();
    }

    @Override
    public String toString() {
        return "SecurityGroup{" +
                "groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                ", groupType='" + groupType + '\'' +
                '}';
    }
}