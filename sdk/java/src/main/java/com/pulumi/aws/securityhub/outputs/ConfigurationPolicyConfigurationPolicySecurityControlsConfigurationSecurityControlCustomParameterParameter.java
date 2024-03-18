// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.aws.securityhub.outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterBool;
import com.pulumi.aws.securityhub.outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDouble;
import com.pulumi.aws.securityhub.outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnum;
import com.pulumi.aws.securityhub.outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnumList;
import com.pulumi.aws.securityhub.outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterInt;
import com.pulumi.aws.securityhub.outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterIntList;
import com.pulumi.aws.securityhub.outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterString;
import com.pulumi.aws.securityhub.outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterStringList;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameter {
    /**
     * @return The bool `value` for a Boolean-typed Security Hub Control Parameter.
     * 
     */
    private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterBool bool;
    /**
     * @return The float `value` for a Double-typed Security Hub Control Parameter.
     * 
     */
    private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDouble double_;
    /**
     * @return The string `value` for a Enum-typed Security Hub Control Parameter.
     * 
     */
    private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnum enum_;
    /**
     * @return The string list `value` for a EnumList-typed Security Hub Control Parameter.
     * 
     */
    private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnumList enumList;
    /**
     * @return The int `value` for a Int-typed Security Hub Control Parameter.
     * 
     */
    private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterInt int_;
    /**
     * @return The int list `value` for a IntList-typed Security Hub Control Parameter.
     * 
     */
    private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterIntList intList;
    /**
     * @return The name of the control parameter. For more information see the [Security Hub controls reference] documentation.
     * 
     */
    private String name;
    /**
     * @return The string `value` for a String-typed Security Hub Control Parameter.
     * 
     */
    private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterString string;
    /**
     * @return The string list `value` for a StringList-typed Security Hub Control Parameter.
     * 
     */
    private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterStringList stringList;
    /**
     * @return Identifies whether a control parameter uses a custom user-defined value or subscribes to the default Security Hub behavior. Valid values: `DEFAULT`, `CUSTOM`.
     * 
     */
    private String valueType;

    private ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameter() {}
    /**
     * @return The bool `value` for a Boolean-typed Security Hub Control Parameter.
     * 
     */
    public Optional<ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterBool> bool() {
        return Optional.ofNullable(this.bool);
    }
    /**
     * @return The float `value` for a Double-typed Security Hub Control Parameter.
     * 
     */
    public Optional<ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDouble> double_() {
        return Optional.ofNullable(this.double_);
    }
    /**
     * @return The string `value` for a Enum-typed Security Hub Control Parameter.
     * 
     */
    public Optional<ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnum> enum_() {
        return Optional.ofNullable(this.enum_);
    }
    /**
     * @return The string list `value` for a EnumList-typed Security Hub Control Parameter.
     * 
     */
    public Optional<ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnumList> enumList() {
        return Optional.ofNullable(this.enumList);
    }
    /**
     * @return The int `value` for a Int-typed Security Hub Control Parameter.
     * 
     */
    public Optional<ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterInt> int_() {
        return Optional.ofNullable(this.int_);
    }
    /**
     * @return The int list `value` for a IntList-typed Security Hub Control Parameter.
     * 
     */
    public Optional<ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterIntList> intList() {
        return Optional.ofNullable(this.intList);
    }
    /**
     * @return The name of the control parameter. For more information see the [Security Hub controls reference] documentation.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The string `value` for a String-typed Security Hub Control Parameter.
     * 
     */
    public Optional<ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterString> string() {
        return Optional.ofNullable(this.string);
    }
    /**
     * @return The string list `value` for a StringList-typed Security Hub Control Parameter.
     * 
     */
    public Optional<ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterStringList> stringList() {
        return Optional.ofNullable(this.stringList);
    }
    /**
     * @return Identifies whether a control parameter uses a custom user-defined value or subscribes to the default Security Hub behavior. Valid values: `DEFAULT`, `CUSTOM`.
     * 
     */
    public String valueType() {
        return this.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterBool bool;
        private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDouble double_;
        private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnum enum_;
        private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnumList enumList;
        private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterInt int_;
        private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterIntList intList;
        private String name;
        private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterString string;
        private @Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterStringList stringList;
        private String valueType;
        public Builder() {}
        public Builder(ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bool = defaults.bool;
    	      this.double_ = defaults.double_;
    	      this.enum_ = defaults.enum_;
    	      this.enumList = defaults.enumList;
    	      this.int_ = defaults.int_;
    	      this.intList = defaults.intList;
    	      this.name = defaults.name;
    	      this.string = defaults.string;
    	      this.stringList = defaults.stringList;
    	      this.valueType = defaults.valueType;
        }

        @CustomType.Setter
        public Builder bool(@Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterBool bool) {

            this.bool = bool;
            return this;
        }
        @CustomType.Setter("double")
        public Builder double_(@Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterDouble double_) {

            this.double_ = double_;
            return this;
        }
        @CustomType.Setter("enum")
        public Builder enum_(@Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnum enum_) {

            this.enum_ = enum_;
            return this;
        }
        @CustomType.Setter
        public Builder enumList(@Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterEnumList enumList) {

            this.enumList = enumList;
            return this;
        }
        @CustomType.Setter("int")
        public Builder int_(@Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterInt int_) {

            this.int_ = int_;
            return this;
        }
        @CustomType.Setter
        public Builder intList(@Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterIntList intList) {

            this.intList = intList;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameter", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder string(@Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterString string) {

            this.string = string;
            return this;
        }
        @CustomType.Setter
        public Builder stringList(@Nullable ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameterStringList stringList) {

            this.stringList = stringList;
            return this;
        }
        @CustomType.Setter
        public Builder valueType(String valueType) {
            if (valueType == null) {
              throw new MissingRequiredPropertyException("ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameter", "valueType");
            }
            this.valueType = valueType;
            return this;
        }
        public ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameter build() {
            final var _resultValue = new ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameterParameter();
            _resultValue.bool = bool;
            _resultValue.double_ = double_;
            _resultValue.enum_ = enum_;
            _resultValue.enumList = enumList;
            _resultValue.int_ = int_;
            _resultValue.intList = intList;
            _resultValue.name = name;
            _resultValue.string = string;
            _resultValue.stringList = stringList;
            _resultValue.valueType = valueType;
            return _resultValue;
        }
    }
}
