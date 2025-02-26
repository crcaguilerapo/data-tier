/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import jooq.tables.Payment;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PaymentRecord extends UpdatableRecordImpl<PaymentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>db.payment.payment_id</code>.
     */
    public void setPaymentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db.payment.payment_id</code>.
     */
    public Integer getPaymentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db.payment.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db.payment.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db.payment.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>db.payment.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>db.payment.payment_date</code>.
     */
    public void setPaymentDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>db.payment.payment_date</code>.
     */
    public LocalDateTime getPaymentDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>db.payment.status</code>.
     */
    public void setStatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db.payment.status</code>.
     */
    public String getStatus() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentRecord
     */
    public PaymentRecord() {
        super(Payment.PAYMENT);
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(Integer paymentId, Integer userId, BigDecimal amount, LocalDateTime paymentDate, String status) {
        super(Payment.PAYMENT);

        setPaymentId(paymentId);
        setUserId(userId);
        setAmount(amount);
        setPaymentDate(paymentDate);
        setStatus(status);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(jooq.tables.pojos.Payment value) {
        super(Payment.PAYMENT);

        if (value != null) {
            setPaymentId(value.getPaymentId());
            setUserId(value.getUserId());
            setAmount(value.getAmount());
            setPaymentDate(value.getPaymentDate());
            setStatus(value.getStatus());
            resetChangedOnNotNull();
        }
    }
}
