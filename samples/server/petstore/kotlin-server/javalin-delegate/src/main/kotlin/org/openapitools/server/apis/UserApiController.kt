package org.openapitools.server.apis

import java.util.Optional
import org.openapitools.api.UserApiDelegate

class UserApiController(
    delegate: UserApiDelegate?
) : UserApi {
    private lateinit var delegate: UserApiDelegate

    init {
        this.delegate = Optional.ofNullable(delegate).orElse(object : UserApiDelegate {})
    }

    override fun getDelegate(): UserApiDelegate = delegate
}
