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

__all__ = ['ServerlessVpcEndpointArgs', 'ServerlessVpcEndpoint']

@pulumi.input_type
class ServerlessVpcEndpointArgs:
    def __init__(__self__, *,
                 subnet_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 vpc_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input['ServerlessVpcEndpointTimeoutsArgs']] = None):
        """
        The set of arguments for constructing a ServerlessVpcEndpoint resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: One or more subnet IDs from which you'll access OpenSearch Serverless. Up to 6 subnets can be provided.
        :param pulumi.Input[str] vpc_id: ID of the VPC from which you'll access OpenSearch Serverless.
               
               The following arguments are optional:
        :param pulumi.Input[str] name: Name of the interface endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
        """
        pulumi.set(__self__, "subnet_ids", subnet_ids)
        pulumi.set(__self__, "vpc_id", vpc_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        One or more subnet IDs from which you'll access OpenSearch Serverless. Up to 6 subnets can be provided.
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        ID of the VPC from which you'll access OpenSearch Serverless.

        The following arguments are optional:
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the interface endpoint.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['ServerlessVpcEndpointTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['ServerlessVpcEndpointTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.input_type
class _ServerlessVpcEndpointState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input['ServerlessVpcEndpointTimeoutsArgs']] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServerlessVpcEndpoint resources.
        :param pulumi.Input[str] name: Name of the interface endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: One or more subnet IDs from which you'll access OpenSearch Serverless. Up to 6 subnets can be provided.
        :param pulumi.Input[str] vpc_id: ID of the VPC from which you'll access OpenSearch Serverless.
               
               The following arguments are optional:
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the interface endpoint.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        One or more subnet IDs from which you'll access OpenSearch Serverless. Up to 6 subnets can be provided.
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['ServerlessVpcEndpointTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['ServerlessVpcEndpointTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the VPC from which you'll access OpenSearch Serverless.

        The following arguments are optional:
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class ServerlessVpcEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['ServerlessVpcEndpointTimeoutsArgs']]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS OpenSearchServerless VPC Endpoint.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.opensearch.ServerlessVpcEndpoint("example",
            name="myendpoint",
            subnet_ids=[example_aws_subnet["id"]],
            vpc_id=example_aws_vpc["id"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import OpenSearchServerless Vpc Endpointa using the `id`. For example:

        ```sh
        $ pulumi import aws:opensearch/serverlessVpcEndpoint:ServerlessVpcEndpoint example vpce-8012925589
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of the interface endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: One or more subnet IDs from which you'll access OpenSearch Serverless. Up to 6 subnets can be provided.
        :param pulumi.Input[str] vpc_id: ID of the VPC from which you'll access OpenSearch Serverless.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServerlessVpcEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS OpenSearchServerless VPC Endpoint.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.opensearch.ServerlessVpcEndpoint("example",
            name="myendpoint",
            subnet_ids=[example_aws_subnet["id"]],
            vpc_id=example_aws_vpc["id"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import OpenSearchServerless Vpc Endpointa using the `id`. For example:

        ```sh
        $ pulumi import aws:opensearch/serverlessVpcEndpoint:ServerlessVpcEndpoint example vpce-8012925589
        ```

        :param str resource_name: The name of the resource.
        :param ServerlessVpcEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServerlessVpcEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['ServerlessVpcEndpointTimeoutsArgs']]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServerlessVpcEndpointArgs.__new__(ServerlessVpcEndpointArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["security_group_ids"] = security_group_ids
            if subnet_ids is None and not opts.urn:
                raise TypeError("Missing required property 'subnet_ids'")
            __props__.__dict__["subnet_ids"] = subnet_ids
            __props__.__dict__["timeouts"] = timeouts
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
        super(ServerlessVpcEndpoint, __self__).__init__(
            'aws:opensearch/serverlessVpcEndpoint:ServerlessVpcEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            timeouts: Optional[pulumi.Input[pulumi.InputType['ServerlessVpcEndpointTimeoutsArgs']]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'ServerlessVpcEndpoint':
        """
        Get an existing ServerlessVpcEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of the interface endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: One or more subnet IDs from which you'll access OpenSearch Serverless. Up to 6 subnets can be provided.
        :param pulumi.Input[str] vpc_id: ID of the VPC from which you'll access OpenSearch Serverless.
               
               The following arguments are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServerlessVpcEndpointState.__new__(_ServerlessVpcEndpointState)

        __props__.__dict__["name"] = name
        __props__.__dict__["security_group_ids"] = security_group_ids
        __props__.__dict__["subnet_ids"] = subnet_ids
        __props__.__dict__["timeouts"] = timeouts
        __props__.__dict__["vpc_id"] = vpc_id
        return ServerlessVpcEndpoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the interface endpoint.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        One or more subnet IDs from which you'll access OpenSearch Serverless. Up to 6 subnets can be provided.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.ServerlessVpcEndpointTimeouts']]:
        return pulumi.get(self, "timeouts")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        ID of the VPC from which you'll access OpenSearch Serverless.

        The following arguments are optional:
        """
        return pulumi.get(self, "vpc_id")

