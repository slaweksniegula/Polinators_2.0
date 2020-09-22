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
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConfirmation", "valid.passwordConfirmation");

       CreateUserDto dto = (CreateUserDto) o;
//        if (!dto.getPassword().equals(dto.getPasswordConfirmation())) {
//            errors.rejectValue("passwordConfirmation", "valid.passwordConfirmationDiff");
//        }

//        String userName = dto.getUserName();
//        if (userName.length() < 3 || userName.length() > 25) {
//            errors.rejectValue("userName", "valid.userNameLength");
//        }
    }
}