package com.kangyasin.music.model

import java.io.Serializable

/**
 * Created by Kang Yasin on 16-04-2021.
 */

class ModelListLagu : Serializable {

    var strId: String? = null

    @JvmField
    var strJudulMusic: String? = null

    @JvmField
    var strNamaBand: String? = null

    @JvmField
    var strCoverLagu: String? = null

}
