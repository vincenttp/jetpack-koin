package id.vincenttp.data.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by vincenttp on 2019-08-05.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
class RepoRespon {
    @JsonProperty("id")
    var id = 0
    @JsonProperty("name")
    lateinit var name: String
    @JsonProperty("html_url")
    lateinit var html_url: String
}