package org.openapitools.server.apis

import java.util.Optional
import org.openapitools.api.StoreApiDelegate

class StoreApiController(
    delegate: StoreApiDelegate?
) : StoreApi {
    private lateinit var delegate: StoreApiDelegate

    init {
        this.delegate = Optional.ofNullable(delegate).orElse(object : StoreApiDelegate {})
    }

    override fun getDelegate(): StoreApiDelegate = delegate
}
