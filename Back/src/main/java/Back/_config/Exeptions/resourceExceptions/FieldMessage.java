package Back._config.Exeptions.resourceExceptions;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class FieldMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fieldName;
    private String message;

    public FieldMessage() {
        super();
    }

    public FieldMessage(String fieldName, String message) {
        super();
        this.fieldName = fieldName;
        this.message = message;
    }


    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
