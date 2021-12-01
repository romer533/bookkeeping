package ru.bookkeeping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bookkeeping.domain.Payment;

import java.util.ArrayList;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    List<Payment> payments = new ArrayList<>();
}
