package Polinators_20.validator;

import Polinators_20.dto.CreateUserDto;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class UserPasswordValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return CreateUserDto.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "valid.password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConfirm", "valid.passwordConfirm");

        CreateUserDto dto = (CreateUserDto) o;
        if (!dto.getPassword().equals(dto.getPasswordConfirmation())) {
            errors.rejectValue("passwordConfirmation", "valid.passwordConfirmDiff");
        }

        String firstName = dto.getFirstName();
        if (firstName.length() < 3 || firstName.length() > 25) {
            errors.rejectValue("firstName", "valid.firstNameLength");
        }
    }
}