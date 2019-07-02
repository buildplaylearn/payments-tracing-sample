package br.com.ismaley.sample.payments.model

import org.jetbrains.annotations.NotNull
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
data class PaymentMethod(@Id val id: String? = null,
                         @Column(name = "name", nullable = false) val name: String? = null,
                         @Column(name = "type", nullable = false) val type: String? = null,
                         @Column(name = "customer_id", nullable = false) val customerId: String? = null) {

    fun pay() = "OK!"
}
