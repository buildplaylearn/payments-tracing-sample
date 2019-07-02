package br.com.ismaley.sample.payments.controller

import br.com.ismaley.sample.payments.dto.PaymentMethodDTO
import br.com.ismaley.sample.payments.dto.PaymentMethodRequest
import br.com.ismaley.sample.payments.model.PaymentMethod
import java.util.UUID

class Mapper {

    companion object {
        fun toModel(paymentMethodRequest: PaymentMethodRequest) = PaymentMethod(id = UUID.randomUUID().toString(),
            customerId = paymentMethodRequest.customerId,
            name = paymentMethodRequest.name,
            type = paymentMethodRequest.type
        )

        fun toDTO(paymentMethod: PaymentMethod) = PaymentMethodDTO(paymentMethodId = paymentMethod.id!!,
            customerId = paymentMethod.customerId!!,
            name = paymentMethod.name!!,
            type = paymentMethod.type!!)
    }

}