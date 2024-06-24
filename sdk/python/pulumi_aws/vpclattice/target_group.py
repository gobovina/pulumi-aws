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

__all__ = ['TargetGroupArgs', 'TargetGroup']

@pulumi.input_type
class TargetGroupArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str],
                 config: Optional[pulumi.Input['TargetGroupConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a TargetGroup resource.
        :param pulumi.Input[str] type: The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`
               
               The following arguments are optional:
        :param pulumi.Input['TargetGroupConfigArgs'] config: The target group configuration.
        :param pulumi.Input[str] name: The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "type", type)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`

        The following arguments are optional:
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['TargetGroupConfigArgs']]:
        """
        The target group configuration.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['TargetGroupConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _TargetGroupState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input['TargetGroupConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TargetGroup resources.
        :param pulumi.Input[str] arn: ARN of the target group.
        :param pulumi.Input['TargetGroupConfigArgs'] config: The target group configuration.
        :param pulumi.Input[str] name: The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        :param pulumi.Input[str] status: Status of the target group.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`
               
               The following arguments are optional:
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the target group.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['TargetGroupConfigArgs']]:
        """
        The target group configuration.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['TargetGroupConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the target group.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`

        The following arguments are optional:
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class TargetGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[pulumi.InputType['TargetGroupConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS VPC Lattice Target Group.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpclattice.TargetGroup("example",
            name="example",
            type="INSTANCE",
            config=aws.vpclattice.TargetGroupConfigArgs(
                vpc_identifier=example_aws_vpc["id"],
                port=443,
                protocol="HTTPS",
            ))
        ```

        ### Basic usage with Health check

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpclattice.TargetGroup("example",
            name="example",
            type="IP",
            config=aws.vpclattice.TargetGroupConfigArgs(
                vpc_identifier=example_aws_vpc["id"],
                ip_address_type="IPV4",
                port=443,
                protocol="HTTPS",
                protocol_version="HTTP1",
                health_check=aws.vpclattice.TargetGroupConfigHealthCheckArgs(
                    enabled=True,
                    health_check_interval_seconds=20,
                    health_check_timeout_seconds=10,
                    healthy_threshold_count=7,
                    unhealthy_threshold_count=3,
                    matcher=aws.vpclattice.TargetGroupConfigHealthCheckMatcherArgs(
                        value="200-299",
                    ),
                    path="/instance",
                    port=80,
                    protocol="HTTP",
                    protocol_version="HTTP1",
                ),
            ))
        ```

        ### ALB

        If the type is ALB, `health_check` block is not supported.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpclattice.TargetGroup("example",
            name="example",
            type="ALB",
            config=aws.vpclattice.TargetGroupConfigArgs(
                vpc_identifier=example_aws_vpc["id"],
                port=443,
                protocol="HTTPS",
                protocol_version="HTTP1",
            ))
        ```

        ### Lambda

        If the type is Lambda, `config` block is not supported.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpclattice.TargetGroup("example",
            name="example",
            type="LAMBDA")
        ```

        ## Import

        Using `pulumi import`, import VPC Lattice Target Group using the `id`. For example:

        ```sh
        $ pulumi import aws:vpclattice/targetGroup:TargetGroup example tg-0c11d4dc16ed96bdb
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['TargetGroupConfigArgs']] config: The target group configuration.
        :param pulumi.Input[str] name: The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TargetGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS VPC Lattice Target Group.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpclattice.TargetGroup("example",
            name="example",
            type="INSTANCE",
            config=aws.vpclattice.TargetGroupConfigArgs(
                vpc_identifier=example_aws_vpc["id"],
                port=443,
                protocol="HTTPS",
            ))
        ```

        ### Basic usage with Health check

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpclattice.TargetGroup("example",
            name="example",
            type="IP",
            config=aws.vpclattice.TargetGroupConfigArgs(
                vpc_identifier=example_aws_vpc["id"],
                ip_address_type="IPV4",
                port=443,
                protocol="HTTPS",
                protocol_version="HTTP1",
                health_check=aws.vpclattice.TargetGroupConfigHealthCheckArgs(
                    enabled=True,
                    health_check_interval_seconds=20,
                    health_check_timeout_seconds=10,
                    healthy_threshold_count=7,
                    unhealthy_threshold_count=3,
                    matcher=aws.vpclattice.TargetGroupConfigHealthCheckMatcherArgs(
                        value="200-299",
                    ),
                    path="/instance",
                    port=80,
                    protocol="HTTP",
                    protocol_version="HTTP1",
                ),
            ))
        ```

        ### ALB

        If the type is ALB, `health_check` block is not supported.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpclattice.TargetGroup("example",
            name="example",
            type="ALB",
            config=aws.vpclattice.TargetGroupConfigArgs(
                vpc_identifier=example_aws_vpc["id"],
                port=443,
                protocol="HTTPS",
                protocol_version="HTTP1",
            ))
        ```

        ### Lambda

        If the type is Lambda, `config` block is not supported.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpclattice.TargetGroup("example",
            name="example",
            type="LAMBDA")
        ```

        ## Import

        Using `pulumi import`, import VPC Lattice Target Group using the `id`. For example:

        ```sh
        $ pulumi import aws:vpclattice/targetGroup:TargetGroup example tg-0c11d4dc16ed96bdb
        ```

        :param str resource_name: The name of the resource.
        :param TargetGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TargetGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[pulumi.InputType['TargetGroupConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TargetGroupArgs.__new__(TargetGroupArgs)

            __props__.__dict__["config"] = config
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["tags_all"] = None
        super(TargetGroup, __self__).__init__(
            'aws:vpclattice/targetGroup:TargetGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            config: Optional[pulumi.Input[pulumi.InputType['TargetGroupConfigArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'TargetGroup':
        """
        Get an existing TargetGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the target group.
        :param pulumi.Input[pulumi.InputType['TargetGroupConfigArgs']] config: The target group configuration.
        :param pulumi.Input[str] name: The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        :param pulumi.Input[str] status: Status of the target group.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`
               
               The following arguments are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TargetGroupState.__new__(_TargetGroupState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["config"] = config
        __props__.__dict__["name"] = name
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["type"] = type
        return TargetGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the target group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Optional['outputs.TargetGroupConfig']]:
        """
        The target group configuration.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the target group.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`

        The following arguments are optional:
        """
        return pulumi.get(self, "type")

