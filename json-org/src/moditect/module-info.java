// Generated 27-Mar-2019 using Moditect maven plugin
module com.fasterxml.jackson.datatype.jsonorg {
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

    // is this the package name
    requires static json;
    //^2015
    requires static org.json;

    exports com.fasterxml.jackson.datatype.jsonorg;

    provides com.fasterxml.jackson.databind.JacksonModule with
        com.fasterxml.jackson.datatype.jsonorg.JsonOrgModule;

}
