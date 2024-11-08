package org.openapitools.server.apis

import java.util.Optional
import org.openapitools.api.PetApiDelegate

class PetApiController(
    delegate: PetApiDelegate?
) : PetApi {
    private lateinit var delegate: PetApiDelegate

    init {
        this.delegate = Optional.ofNullable(delegate).orElse(object : PetApiDelegate {})
    }

    override fun getDelegate(): PetApiDelegate = delegate
}
