package br.com.ismaley.sample.payments.service

import br.com.ismaley.sample.payments.dto.PaymentMethodUpdateRequest
import br.com.ismaley.sample.payments.exception.NotFoundException
import br.com.ismaley.sample.payments.model.PaymentMethod
import br.com.ismaley.sample.payments.repository.PaymentRepository
import org.springframework.stereotype.Service

@Service
class PaymentService(private val repository: PaymentRepository) {

    fun createPaymentMethod(request: PaymentMethod): PaymentMethod = repository.save(request)

    fun getPaymentMethod(id: String): PaymentMethod = findOrFail(id)

    fun pay(id: String): String = findOrFail(id).pay()

    fun updatePaymentMethod(id: String, request: PaymentMethodUpdateRequest): PaymentMethod =
        findOrFail(id).copy(name = request.name, description = request.description)

    fun deletePaymentMethod(id: String) = findOrFail(id).let(repository::delete)

    private fun findOrFail(id: String): PaymentMethod =
         repository.findOne(id) ?: throw NotFoundException("not found")
}
