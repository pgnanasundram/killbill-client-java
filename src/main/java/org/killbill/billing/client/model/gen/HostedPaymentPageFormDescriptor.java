/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.killbill.billing.client.model.gen.AuditLog;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class HostedPaymentPageFormDescriptor extends KillBillObject {

    private UUID kbAccountId = null;

    private String formMethod = null;

    private String formUrl = null;

    private Map<String, Object> formFields = null;

    private Map<String, Object> properties = null;



    public HostedPaymentPageFormDescriptor() {
    }

    public HostedPaymentPageFormDescriptor(final UUID kbAccountId,
                     final String formMethod,
                     final String formUrl,
                     final Map<String, Object> formFields,
                     final Map<String, Object> properties,
                     final List<AuditLog> auditLogs) {
        super(auditLogs);
        this.kbAccountId = kbAccountId;
        this.formMethod = formMethod;
        this.formUrl = formUrl;
        this.formFields = formFields;
        this.properties = properties;

    }


    public HostedPaymentPageFormDescriptor setKbAccountId(final UUID kbAccountId) {
        this.kbAccountId = kbAccountId;
        return this;
    }

    public UUID getKbAccountId() {
        return kbAccountId;
    }

    public HostedPaymentPageFormDescriptor setFormMethod(final String formMethod) {
        this.formMethod = formMethod;
        return this;
    }

    public String getFormMethod() {
        return formMethod;
    }

    public HostedPaymentPageFormDescriptor setFormUrl(final String formUrl) {
        this.formUrl = formUrl;
        return this;
    }

    public String getFormUrl() {
        return formUrl;
    }

    public HostedPaymentPageFormDescriptor setFormFields(final Map<String, Object> formFields) {
        this.formFields = formFields;
        return this;
    }

    public HostedPaymentPageFormDescriptor putFormFieldsItem(final String key, final Object formFieldsItem) {
        if (this.formFields == null) {
            this.formFields = new HashMap<String, Object>();
        }
        this.formFields.put(key, formFieldsItem);
        return this;
    }

    public Map<String, Object> getFormFields() {
        return formFields;
    }

    public HostedPaymentPageFormDescriptor setProperties(final Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public HostedPaymentPageFormDescriptor putPropertiesItem(final String key, final Object propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<String, Object>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedPaymentPageFormDescriptor hostedPaymentPageFormDescriptor = (HostedPaymentPageFormDescriptor) o;
        return Objects.equals(this.kbAccountId, hostedPaymentPageFormDescriptor.kbAccountId) &&
        Objects.equals(this.formMethod, hostedPaymentPageFormDescriptor.formMethod) &&
        Objects.equals(this.formUrl, hostedPaymentPageFormDescriptor.formUrl) &&
        Objects.equals(this.formFields, hostedPaymentPageFormDescriptor.formFields) &&
        Objects.equals(this.properties, hostedPaymentPageFormDescriptor.properties) &&
        Objects.equals(this.auditLogs, hostedPaymentPageFormDescriptor.auditLogs);

    }

    @Override
    public int hashCode() {
        return Objects.hash(kbAccountId,
                            formMethod,
                            formUrl,
                            formFields,
                            properties,
                            auditLogs, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedPaymentPageFormDescriptor {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    kbAccountId: ").append(toIndentedString(kbAccountId)).append("\n");
        sb.append("    formMethod: ").append(toIndentedString(formMethod)).append("\n");
        sb.append("    formUrl: ").append(toIndentedString(formUrl)).append("\n");
        sb.append("    formFields: ").append(toIndentedString(formFields)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
