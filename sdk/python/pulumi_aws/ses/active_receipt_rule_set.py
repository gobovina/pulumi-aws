# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ActiveReceiptRuleSetArgs', 'ActiveReceiptRuleSet']

@pulumi.input_type
class ActiveReceiptRuleSetArgs:
    def __init__(__self__, *,
                 rule_set_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a ActiveReceiptRuleSet resource.
        :param pulumi.Input[str] rule_set_name: The name of the rule set
        """
        pulumi.set(__self__, "rule_set_name", rule_set_name)

    @property
    @pulumi.getter(name="ruleSetName")
    def rule_set_name(self) -> pulumi.Input[str]:
        """
        The name of the rule set
        """
        return pulumi.get(self, "rule_set_name")

    @rule_set_name.setter
    def rule_set_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "rule_set_name", value)


@pulumi.input_type
class _ActiveReceiptRuleSetState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 rule_set_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ActiveReceiptRuleSet resources.
        :param pulumi.Input[str] arn: The SES receipt rule set ARN.
        :param pulumi.Input[str] rule_set_name: The name of the rule set
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if rule_set_name is not None:
            pulumi.set(__self__, "rule_set_name", rule_set_name)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The SES receipt rule set ARN.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="ruleSetName")
    def rule_set_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the rule set
        """
        return pulumi.get(self, "rule_set_name")

    @rule_set_name.setter
    def rule_set_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_set_name", value)


class ActiveReceiptRuleSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 rule_set_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to designate the active SES receipt rule set

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        main = aws.ses.ActiveReceiptRuleSet("main", rule_set_name="primary-rules")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import active SES receipt rule sets using the rule set name. For example:

        ```sh
        $ pulumi import aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet my_rule_set my_rule_set_name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] rule_set_name: The name of the rule set
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ActiveReceiptRuleSetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to designate the active SES receipt rule set

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        main = aws.ses.ActiveReceiptRuleSet("main", rule_set_name="primary-rules")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import active SES receipt rule sets using the rule set name. For example:

        ```sh
        $ pulumi import aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet my_rule_set my_rule_set_name
        ```

        :param str resource_name: The name of the resource.
        :param ActiveReceiptRuleSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ActiveReceiptRuleSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 rule_set_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ActiveReceiptRuleSetArgs.__new__(ActiveReceiptRuleSetArgs)

            if rule_set_name is None and not opts.urn:
                raise TypeError("Missing required property 'rule_set_name'")
            __props__.__dict__["rule_set_name"] = rule_set_name
            __props__.__dict__["arn"] = None
        super(ActiveReceiptRuleSet, __self__).__init__(
            'aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            rule_set_name: Optional[pulumi.Input[str]] = None) -> 'ActiveReceiptRuleSet':
        """
        Get an existing ActiveReceiptRuleSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The SES receipt rule set ARN.
        :param pulumi.Input[str] rule_set_name: The name of the rule set
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ActiveReceiptRuleSetState.__new__(_ActiveReceiptRuleSetState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["rule_set_name"] = rule_set_name
        return ActiveReceiptRuleSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The SES receipt rule set ARN.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="ruleSetName")
    def rule_set_name(self) -> pulumi.Output[str]:
        """
        The name of the rule set
        """
        return pulumi.get(self, "rule_set_name")

