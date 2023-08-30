# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AliasArgs', 'Alias']

@pulumi.input_type
class AliasArgs:
    def __init__(__self__, *,
                 routing_configurations: pulumi.Input[Sequence[pulumi.Input['AliasRoutingConfigurationArgs']]],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Alias resource.
        :param pulumi.Input[Sequence[pulumi.Input['AliasRoutingConfigurationArgs']]] routing_configurations: The StateMachine alias' route configuration settings. Fields documented below
        :param pulumi.Input[str] description: Description of the alias.
        :param pulumi.Input[str] name: Name for the alias you are creating.
        """
        pulumi.set(__self__, "routing_configurations", routing_configurations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="routingConfigurations")
    def routing_configurations(self) -> pulumi.Input[Sequence[pulumi.Input['AliasRoutingConfigurationArgs']]]:
        """
        The StateMachine alias' route configuration settings. Fields documented below
        """
        return pulumi.get(self, "routing_configurations")

    @routing_configurations.setter
    def routing_configurations(self, value: pulumi.Input[Sequence[pulumi.Input['AliasRoutingConfigurationArgs']]]):
        pulumi.set(self, "routing_configurations", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the alias.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name for the alias you are creating.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AliasState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 creation_date: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 routing_configurations: Optional[pulumi.Input[Sequence[pulumi.Input['AliasRoutingConfigurationArgs']]]] = None):
        """
        Input properties used for looking up and filtering Alias resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) identifying your state machine alias.
        :param pulumi.Input[str] creation_date: The date the state machine alias was created.
        :param pulumi.Input[str] description: Description of the alias.
        :param pulumi.Input[str] name: Name for the alias you are creating.
        :param pulumi.Input[Sequence[pulumi.Input['AliasRoutingConfigurationArgs']]] routing_configurations: The StateMachine alias' route configuration settings. Fields documented below
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if creation_date is not None:
            pulumi.set(__self__, "creation_date", creation_date)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if routing_configurations is not None:
            pulumi.set(__self__, "routing_configurations", routing_configurations)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) identifying your state machine alias.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="creationDate")
    def creation_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date the state machine alias was created.
        """
        return pulumi.get(self, "creation_date")

    @creation_date.setter
    def creation_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creation_date", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the alias.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name for the alias you are creating.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="routingConfigurations")
    def routing_configurations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AliasRoutingConfigurationArgs']]]]:
        """
        The StateMachine alias' route configuration settings. Fields documented below
        """
        return pulumi.get(self, "routing_configurations")

    @routing_configurations.setter
    def routing_configurations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AliasRoutingConfigurationArgs']]]]):
        pulumi.set(self, "routing_configurations", value)


class Alias(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 routing_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AliasRoutingConfigurationArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Step Function State Machine Alias.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        sfn_alias = aws.sfn.Alias("sfnAlias", routing_configurations=[aws.sfn.AliasRoutingConfigurationArgs(
            state_machine_version_arn=aws_sfn_state_machine["sfn_test"]["state_machine_version_arn"],
            weight=100,
        )])
        my_sfn_alias = aws.sfn.Alias("mySfnAlias", routing_configurations=[
            aws.sfn.AliasRoutingConfigurationArgs(
                state_machine_version_arn="arn:aws:states:us-east-1:12345:stateMachine:demo:3",
                weight=50,
            ),
            aws.sfn.AliasRoutingConfigurationArgs(
                state_machine_version_arn="arn:aws:states:us-east-1:12345:stateMachine:demo:2",
                weight=50,
            ),
        ])
        ```

        ## Import

        Using `pulumi import`, import SFN (Step Functions) Alias using the `arn`. For example:

        ```sh
         $ pulumi import aws:sfn/alias:Alias foo arn:aws:states:us-east-1:123456789098:stateMachine:myStateMachine:foo
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the alias.
        :param pulumi.Input[str] name: Name for the alias you are creating.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AliasRoutingConfigurationArgs']]]] routing_configurations: The StateMachine alias' route configuration settings. Fields documented below
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AliasArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Step Function State Machine Alias.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        sfn_alias = aws.sfn.Alias("sfnAlias", routing_configurations=[aws.sfn.AliasRoutingConfigurationArgs(
            state_machine_version_arn=aws_sfn_state_machine["sfn_test"]["state_machine_version_arn"],
            weight=100,
        )])
        my_sfn_alias = aws.sfn.Alias("mySfnAlias", routing_configurations=[
            aws.sfn.AliasRoutingConfigurationArgs(
                state_machine_version_arn="arn:aws:states:us-east-1:12345:stateMachine:demo:3",
                weight=50,
            ),
            aws.sfn.AliasRoutingConfigurationArgs(
                state_machine_version_arn="arn:aws:states:us-east-1:12345:stateMachine:demo:2",
                weight=50,
            ),
        ])
        ```

        ## Import

        Using `pulumi import`, import SFN (Step Functions) Alias using the `arn`. For example:

        ```sh
         $ pulumi import aws:sfn/alias:Alias foo arn:aws:states:us-east-1:123456789098:stateMachine:myStateMachine:foo
        ```

        :param str resource_name: The name of the resource.
        :param AliasArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AliasArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 routing_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AliasRoutingConfigurationArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AliasArgs.__new__(AliasArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if routing_configurations is None and not opts.urn:
                raise TypeError("Missing required property 'routing_configurations'")
            __props__.__dict__["routing_configurations"] = routing_configurations
            __props__.__dict__["arn"] = None
            __props__.__dict__["creation_date"] = None
        super(Alias, __self__).__init__(
            'aws:sfn/alias:Alias',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            creation_date: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            routing_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AliasRoutingConfigurationArgs']]]]] = None) -> 'Alias':
        """
        Get an existing Alias resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) identifying your state machine alias.
        :param pulumi.Input[str] creation_date: The date the state machine alias was created.
        :param pulumi.Input[str] description: Description of the alias.
        :param pulumi.Input[str] name: Name for the alias you are creating.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AliasRoutingConfigurationArgs']]]] routing_configurations: The StateMachine alias' route configuration settings. Fields documented below
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AliasState.__new__(_AliasState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["creation_date"] = creation_date
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["routing_configurations"] = routing_configurations
        return Alias(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) identifying your state machine alias.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="creationDate")
    def creation_date(self) -> pulumi.Output[str]:
        """
        The date the state machine alias was created.
        """
        return pulumi.get(self, "creation_date")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the alias.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name for the alias you are creating.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="routingConfigurations")
    def routing_configurations(self) -> pulumi.Output[Sequence['outputs.AliasRoutingConfiguration']]:
        """
        The StateMachine alias' route configuration settings. Fields documented below
        """
        return pulumi.get(self, "routing_configurations")

