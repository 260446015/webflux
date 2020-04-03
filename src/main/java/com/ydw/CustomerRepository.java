package com.ydw;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author yindwe@yonyou.com
 * @Date 2020/4/2
 */
public interface CustomerRepository {
    Mono<Customer> getCustomerById(Long id);

    Flux<Customer> getAllCustomers();

    Mono<Void> saveCustomer(Mono<Customer> customer);

    Mono<Customer> putCustomer(Long id, Mono<Customer> customer);

    Mono<String> deleteCustomer(Long id);
}
