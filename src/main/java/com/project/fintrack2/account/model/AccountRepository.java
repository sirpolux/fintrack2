package com.project.fintrack2.account.model;

import com.project.fintrack2.account.enums.AccountType;
import com.project.fintrack2.user.model.User;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Boolean existsByUserAndAccountNameAndAccountType(User user, @NotNull String accountName, @NotNull AccountType accountType);
}
