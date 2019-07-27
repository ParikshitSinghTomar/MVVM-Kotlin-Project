package bdt.docdoc.repo.remote.model.common

import bdt.docdoc.common.Constants

/**
 * Created by parikshit on 26/7/19.
 */
open class CommonObjectSymptomsDescription {

    var name=Constants.EMPTY_STRING

    var objectType=OBJECT_TYPE.NONE

    enum class OBJECT_TYPE {
       NONE, HEAD_SYMPTOMS,SYMPTOMS,HEAD_MEDICINE,MEDICINE,ADD_SYMPTOMS,ADD_MEDICINE
    }
}