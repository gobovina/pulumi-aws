# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ConfigurationPolicyAssociationArgs', 'ConfigurationPolicyAssociation']

@pulumi.input_type
class ConfigurationPolicyAssociationArgs:
    def __init__(__self__, *,
                 policy_id: pulumi.Input[str],
                 target_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a ConfigurationPolicyAssociation resource.
        :param pulumi.Input[str] policy_id: The universally unique identifier (UUID) of the configuration policy.
        :param pulumi.Input[str] target_id: The identifier of the target account, organizational unit, or the root to associate with the specified configuration.
        """
        pulumi.set(__self__, "policy_id", policy_id)
        pulumi.set(__self__, "target_id", target_id)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[str]:
        """
        The universally unique identifier (UUID) of the configuration policy.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter(name="targetId")
    def target_id(self) -> pulumi.Input[str]:
        """
        The identifier of the target account, organizational unit, or the root to associate with the specified configuration.
        """
        return pulumi.get(self, "target_id")

    @target_id.setter
    def target_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "target_id", value)


@pulumi.input_type
class _ConfigurationPolicyAssociationState:
    def __init__(__self__, *,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 target_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ConfigurationPolicyAssociation resources.
        :param pulumi.Input[str] policy_id: The universally unique identifier (UUID) of the configuration policy.
        :param pulumi.Input[str] target_id: The identifier of the target account, organizational unit, or the root to associate with the specified configuration.
        """
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)
        if target_id is not None:
            pulumi.set(__self__, "target_id", target_id)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The universally unique identifier (UUID) of the configuration policy.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter(name="targetId")
    def target_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier of the target account, organizational unit, or the root to associate with the specified configuration.
        """
        return pulumi.get(self, "target_id")

    @target_id.setter
    def target_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_id", value)


class ConfigurationPolicyAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 target_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages Security Hub configuration policy associations.

        > **NOTE:** This resource requires `securityhub.OrganizationConfiguration` to be configured with type `CENTRAL`. More information about Security Hub central configuration and configuration policies can be found in the [How Security Hub configuration policies work](https://docs.aws.amazon.com/securityhub/latest/userguide/configuration-policies-overview.html) documentation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.securityhub.FindingAggregator("example", linking_mode="ALL_REGIONS")
        example_organization_configuration = aws.securityhub.OrganizationConfiguration("example",
            auto_enable=False,
            auto_enable_standards="NONE",
            organization_configuration=aws.securityhub.OrganizationConfigurationOrganizationConfigurationArgs(
                configuration_type="CENTRAL",
            ),
            opts = pulumi.ResourceOptions(depends_on=[example]))
        example_configuration_policy = aws.securityhub.ConfigurationPolicy("example",
            name="Example",
            description="This is an example configuration policy",
            configuration_policy=aws.securityhub.ConfigurationPolicyConfigurationPolicyArgs(
                service_enabled=True,
                enabled_standard_arns=[
                    "arn:aws:securityhub:us-east-1::standards/aws-foundational-security-best-practices/v/1.0.0",
                    "arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0",
                ],
                security_controls_configuration=aws.securityhub.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationArgs(
                    disabled_control_identifiers=[],
                ),
            ),
            opts = pulumi.ResourceOptions(depends_on=[example_organization_configuration]))
        account_example = aws.securityhub.ConfigurationPolicyAssociation("account_example",
            target_id="123456789012",
            policy_id=example_configuration_policy.id)
        root_example = aws.securityhub.ConfigurationPolicyAssociation("root_example",
            target_id="r-abcd",
            policy_id=example_configuration_policy.id)
        ou_example = aws.securityhub.ConfigurationPolicyAssociation("ou_example",
            target_id="ou-abcd-12345678",
            policy_id=example_configuration_policy.id)
        ```

        ## Import

        Using `pulumi import`, import an existing Security Hub enabled account using the target id. For example:

        ```sh
        $ pulumi import aws:securityhub/configurationPolicyAssociation:ConfigurationPolicyAssociation example_account_association 123456789012
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy_id: The universally unique identifier (UUID) of the configuration policy.
        :param pulumi.Input[str] target_id: The identifier of the target account, organizational unit, or the root to associate with the specified configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConfigurationPolicyAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages Security Hub configuration policy associations.

        > **NOTE:** This resource requires `securityhub.OrganizationConfiguration` to be configured with type `CENTRAL`. More information about Security Hub central configuration and configuration policies can be found in the [How Security Hub configuration policies work](https://docs.aws.amazon.com/securityhub/latest/userguide/configuration-policies-overview.html) documentation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.securityhub.FindingAggregator("example", linking_mode="ALL_REGIONS")
        example_organization_configuration = aws.securityhub.OrganizationConfiguration("example",
            auto_enable=False,
            auto_enable_standards="NONE",
            organization_configuration=aws.securityhub.OrganizationConfigurationOrganizationConfigurationArgs(
                configuration_type="CENTRAL",
            ),
            opts = pulumi.ResourceOptions(depends_on=[example]))
        example_configuration_policy = aws.securityhub.ConfigurationPolicy("example",
            name="Example",
            description="This is an example configuration policy",
            configuration_policy=aws.securityhub.ConfigurationPolicyConfigurationPolicyArgs(
                service_enabled=True,
                enabled_standard_arns=[
                    "arn:aws:securityhub:us-east-1::standards/aws-foundational-security-best-practices/v/1.0.0",
                    "arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0",
                ],
                security_controls_configuration=aws.securityhub.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationArgs(
                    disabled_control_identifiers=[],
                ),
            ),
            opts = pulumi.ResourceOptions(depends_on=[example_organization_configuration]))
        account_example = aws.securityhub.ConfigurationPolicyAssociation("account_example",
            target_id="123456789012",
            policy_id=example_configuration_policy.id)
        root_example = aws.securityhub.ConfigurationPolicyAssociation("root_example",
            target_id="r-abcd",
            policy_id=example_configuration_policy.id)
        ou_example = aws.securityhub.ConfigurationPolicyAssociation("ou_example",
            target_id="ou-abcd-12345678",
            policy_id=example_configuration_policy.id)
        ```

        ## Import

        Using `pulumi import`, import an existing Security Hub enabled account using the target id. For example:

        ```sh
        $ pulumi import aws:securityhub/configurationPolicyAssociation:ConfigurationPolicyAssociation example_account_association 123456789012
        ```

        :param str resource_name: The name of the resource.
        :param ConfigurationPolicyAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConfigurationPolicyAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 target_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConfigurationPolicyAssociationArgs.__new__(ConfigurationPolicyAssociationArgs)

            if policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'policy_id'")
            __props__.__dict__["policy_id"] = policy_id
            if target_id is None and not opts.urn:
                raise TypeError("Missing required property 'target_id'")
            __props__.__dict__["target_id"] = target_id
        super(ConfigurationPolicyAssociation, __self__).__init__(
            'aws:securityhub/configurationPolicyAssociation:ConfigurationPolicyAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy_id: Optional[pulumi.Input[str]] = None,
            target_id: Optional[pulumi.Input[str]] = None) -> 'ConfigurationPolicyAssociation':
        """
        Get an existing ConfigurationPolicyAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy_id: The universally unique identifier (UUID) of the configuration policy.
        :param pulumi.Input[str] target_id: The identifier of the target account, organizational unit, or the root to associate with the specified configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConfigurationPolicyAssociationState.__new__(_ConfigurationPolicyAssociationState)

        __props__.__dict__["policy_id"] = policy_id
        __props__.__dict__["target_id"] = target_id
        return ConfigurationPolicyAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[str]:
        """
        The universally unique identifier (UUID) of the configuration policy.
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter(name="targetId")
    def target_id(self) -> pulumi.Output[str]:
        """
        The identifier of the target account, organizational unit, or the root to associate with the specified configuration.
        """
        return pulumi.get(self, "target_id")

