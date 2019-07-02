package br.com.ismaley.sample.payments.dto

import org.hibernate.validator.constraints.NotEmpty
import org.jetbrains.annotations.NotNull
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

data class PaymentMethodRequest(@NotEmpty val name: String,
                                @NotEmpty val type: String,
                                @NotEmpty val customerId: String)

data class PaymentMethodUpdateRequest(val name: String,
                                      val type: String,
                                      val customerId: String)

data class PaymentMethodDTO(val paymentMethodId: String,
                            val name: String,
                            val type: String,
                            val customerId: String)