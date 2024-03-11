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

__all__ = ['EndpointAccessArgs', 'EndpointAccess']

@pulumi.input_type
class EndpointAccessArgs:
    def __init__(__self__, *,
                 cluster_identifier: pulumi.Input[str],
                 endpoint_name: pulumi.Input[str],
                 subnet_group_name: pulumi.Input[str],
                 resource_owner: Optional[pulumi.Input[str]] = None,
                 vpc_security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a EndpointAccess resource.
        :param pulumi.Input[str] cluster_identifier: The cluster identifier of the cluster to access.
        :param pulumi.Input[str] endpoint_name: The Redshift-managed VPC endpoint name.
        :param pulumi.Input[str] subnet_group_name: The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
        :param pulumi.Input[str] resource_owner: The Amazon Web Services account ID of the owner of the cluster. This is only required if the cluster is in another Amazon Web Services account.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vpc_security_group_ids: The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
        """
        pulumi.set(__self__, "cluster_identifier", cluster_identifier)
        pulumi.set(__self__, "endpoint_name", endpoint_name)
        pulumi.set(__self__, "subnet_group_name", subnet_group_name)
        if resource_owner is not None:
            pulumi.set(__self__, "resource_owner", resource_owner)
        if vpc_security_group_ids is not None:
            pulumi.set(__self__, "vpc_security_group_ids", vpc_security_group_ids)

    @property
    @pulumi.getter(name="clusterIdentifier")
    def cluster_identifier(self) -> pulumi.Input[str]:
        """
        The cluster identifier of the cluster to access.
        """
        return pulumi.get(self, "cluster_identifier")

    @cluster_identifier.setter
    def cluster_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_identifier", value)

    @property
    @pulumi.getter(name="endpointName")
    def endpoint_name(self) -> pulumi.Input[str]:
        """
        The Redshift-managed VPC endpoint name.
        """
        return pulumi.get(self, "endpoint_name")

    @endpoint_name.setter
    def endpoint_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint_name", value)

    @property
    @pulumi.getter(name="subnetGroupName")
    def subnet_group_name(self) -> pulumi.Input[str]:
        """
        The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
        """
        return pulumi.get(self, "subnet_group_name")

    @subnet_group_name.setter
    def subnet_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "subnet_group_name", value)

    @property
    @pulumi.getter(name="resourceOwner")
    def resource_owner(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Web Services account ID of the owner of the cluster. This is only required if the cluster is in another Amazon Web Services account.
        """
        return pulumi.get(self, "resource_owner")

    @resource_owner.setter
    def resource_owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_owner", value)

    @property
    @pulumi.getter(name="vpcSecurityGroupIds")
    def vpc_security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
        """
        return pulumi.get(self, "vpc_security_group_ids")

    @vpc_security_group_ids.setter
    def vpc_security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "vpc_security_group_ids", value)


@pulumi.input_type
class _EndpointAccessState:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[str]] = None,
                 cluster_identifier: Optional[pulumi.Input[str]] = None,
                 endpoint_name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 resource_owner: Optional[pulumi.Input[str]] = None,
                 subnet_group_name: Optional[pulumi.Input[str]] = None,
                 vpc_endpoints: Optional[pulumi.Input[Sequence[pulumi.Input['EndpointAccessVpcEndpointArgs']]]] = None,
                 vpc_security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering EndpointAccess resources.
        :param pulumi.Input[str] address: The DNS address of the endpoint.
        :param pulumi.Input[str] cluster_identifier: The cluster identifier of the cluster to access.
        :param pulumi.Input[str] endpoint_name: The Redshift-managed VPC endpoint name.
        :param pulumi.Input[int] port: The port number on which the cluster accepts incoming connections.
        :param pulumi.Input[str] resource_owner: The Amazon Web Services account ID of the owner of the cluster. This is only required if the cluster is in another Amazon Web Services account.
        :param pulumi.Input[str] subnet_group_name: The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
        :param pulumi.Input[Sequence[pulumi.Input['EndpointAccessVpcEndpointArgs']]] vpc_endpoints: The connection endpoint for connecting to an Amazon Redshift cluster through the proxy. See details below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vpc_security_group_ids: The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if cluster_identifier is not None:
            pulumi.set(__self__, "cluster_identifier", cluster_identifier)
        if endpoint_name is not None:
            pulumi.set(__self__, "endpoint_name", endpoint_name)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if resource_owner is not None:
            pulumi.set(__self__, "resource_owner", resource_owner)
        if subnet_group_name is not None:
            pulumi.set(__self__, "subnet_group_name", subnet_group_name)
        if vpc_endpoints is not None:
            pulumi.set(__self__, "vpc_endpoints", vpc_endpoints)
        if vpc_security_group_ids is not None:
            pulumi.set(__self__, "vpc_security_group_ids", vpc_security_group_ids)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[str]]:
        """
        The DNS address of the endpoint.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter(name="clusterIdentifier")
    def cluster_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster identifier of the cluster to access.
        """
        return pulumi.get(self, "cluster_identifier")

    @cluster_identifier.setter
    def cluster_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_identifier", value)

    @property
    @pulumi.getter(name="endpointName")
    def endpoint_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Redshift-managed VPC endpoint name.
        """
        return pulumi.get(self, "endpoint_name")

    @endpoint_name.setter
    def endpoint_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        The port number on which the cluster accepts incoming connections.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter(name="resourceOwner")
    def resource_owner(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Web Services account ID of the owner of the cluster. This is only required if the cluster is in another Amazon Web Services account.
        """
        return pulumi.get(self, "resource_owner")

    @resource_owner.setter
    def resource_owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_owner", value)

    @property
    @pulumi.getter(name="subnetGroupName")
    def subnet_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
        """
        return pulumi.get(self, "subnet_group_name")

    @subnet_group_name.setter
    def subnet_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet_group_name", value)

    @property
    @pulumi.getter(name="vpcEndpoints")
    def vpc_endpoints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EndpointAccessVpcEndpointArgs']]]]:
        """
        The connection endpoint for connecting to an Amazon Redshift cluster through the proxy. See details below.
        """
        return pulumi.get(self, "vpc_endpoints")

    @vpc_endpoints.setter
    def vpc_endpoints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EndpointAccessVpcEndpointArgs']]]]):
        pulumi.set(self, "vpc_endpoints", value)

    @property
    @pulumi.getter(name="vpcSecurityGroupIds")
    def vpc_security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
        """
        return pulumi.get(self, "vpc_security_group_ids")

    @vpc_security_group_ids.setter
    def vpc_security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "vpc_security_group_ids", value)


class EndpointAccess(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_identifier: Optional[pulumi.Input[str]] = None,
                 endpoint_name: Optional[pulumi.Input[str]] = None,
                 resource_owner: Optional[pulumi.Input[str]] = None,
                 subnet_group_name: Optional[pulumi.Input[str]] = None,
                 vpc_security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Creates a new Amazon Redshift endpoint access.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.redshift.EndpointAccess("example",
            endpoint_name="example",
            subnet_group_name=example_aws_redshift_subnet_group["id"],
            cluster_identifier=example_aws_redshift_cluster["clusterIdentifier"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Redshift endpoint access using the `name`. For example:

        ```sh
        $ pulumi import aws:redshift/endpointAccess:EndpointAccess example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_identifier: The cluster identifier of the cluster to access.
        :param pulumi.Input[str] endpoint_name: The Redshift-managed VPC endpoint name.
        :param pulumi.Input[str] resource_owner: The Amazon Web Services account ID of the owner of the cluster. This is only required if the cluster is in another Amazon Web Services account.
        :param pulumi.Input[str] subnet_group_name: The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vpc_security_group_ids: The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EndpointAccessArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a new Amazon Redshift endpoint access.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.redshift.EndpointAccess("example",
            endpoint_name="example",
            subnet_group_name=example_aws_redshift_subnet_group["id"],
            cluster_identifier=example_aws_redshift_cluster["clusterIdentifier"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Redshift endpoint access using the `name`. For example:

        ```sh
        $ pulumi import aws:redshift/endpointAccess:EndpointAccess example example
        ```

        :param str resource_name: The name of the resource.
        :param EndpointAccessArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EndpointAccessArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_identifier: Optional[pulumi.Input[str]] = None,
                 endpoint_name: Optional[pulumi.Input[str]] = None,
                 resource_owner: Optional[pulumi.Input[str]] = None,
                 subnet_group_name: Optional[pulumi.Input[str]] = None,
                 vpc_security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EndpointAccessArgs.__new__(EndpointAccessArgs)

            if cluster_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_identifier'")
            __props__.__dict__["cluster_identifier"] = cluster_identifier
            if endpoint_name is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_name'")
            __props__.__dict__["endpoint_name"] = endpoint_name
            __props__.__dict__["resource_owner"] = resource_owner
            if subnet_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'subnet_group_name'")
            __props__.__dict__["subnet_group_name"] = subnet_group_name
            __props__.__dict__["vpc_security_group_ids"] = vpc_security_group_ids
            __props__.__dict__["address"] = None
            __props__.__dict__["port"] = None
            __props__.__dict__["vpc_endpoints"] = None
        super(EndpointAccess, __self__).__init__(
            'aws:redshift/endpointAccess:EndpointAccess',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[str]] = None,
            cluster_identifier: Optional[pulumi.Input[str]] = None,
            endpoint_name: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[int]] = None,
            resource_owner: Optional[pulumi.Input[str]] = None,
            subnet_group_name: Optional[pulumi.Input[str]] = None,
            vpc_endpoints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EndpointAccessVpcEndpointArgs']]]]] = None,
            vpc_security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'EndpointAccess':
        """
        Get an existing EndpointAccess resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The DNS address of the endpoint.
        :param pulumi.Input[str] cluster_identifier: The cluster identifier of the cluster to access.
        :param pulumi.Input[str] endpoint_name: The Redshift-managed VPC endpoint name.
        :param pulumi.Input[int] port: The port number on which the cluster accepts incoming connections.
        :param pulumi.Input[str] resource_owner: The Amazon Web Services account ID of the owner of the cluster. This is only required if the cluster is in another Amazon Web Services account.
        :param pulumi.Input[str] subnet_group_name: The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EndpointAccessVpcEndpointArgs']]]] vpc_endpoints: The connection endpoint for connecting to an Amazon Redshift cluster through the proxy. See details below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vpc_security_group_ids: The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EndpointAccessState.__new__(_EndpointAccessState)

        __props__.__dict__["address"] = address
        __props__.__dict__["cluster_identifier"] = cluster_identifier
        __props__.__dict__["endpoint_name"] = endpoint_name
        __props__.__dict__["port"] = port
        __props__.__dict__["resource_owner"] = resource_owner
        __props__.__dict__["subnet_group_name"] = subnet_group_name
        __props__.__dict__["vpc_endpoints"] = vpc_endpoints
        __props__.__dict__["vpc_security_group_ids"] = vpc_security_group_ids
        return EndpointAccess(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Output[str]:
        """
        The DNS address of the endpoint.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter(name="clusterIdentifier")
    def cluster_identifier(self) -> pulumi.Output[str]:
        """
        The cluster identifier of the cluster to access.
        """
        return pulumi.get(self, "cluster_identifier")

    @property
    @pulumi.getter(name="endpointName")
    def endpoint_name(self) -> pulumi.Output[str]:
        """
        The Redshift-managed VPC endpoint name.
        """
        return pulumi.get(self, "endpoint_name")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[int]:
        """
        The port number on which the cluster accepts incoming connections.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="resourceOwner")
    def resource_owner(self) -> pulumi.Output[str]:
        """
        The Amazon Web Services account ID of the owner of the cluster. This is only required if the cluster is in another Amazon Web Services account.
        """
        return pulumi.get(self, "resource_owner")

    @property
    @pulumi.getter(name="subnetGroupName")
    def subnet_group_name(self) -> pulumi.Output[str]:
        """
        The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
        """
        return pulumi.get(self, "subnet_group_name")

    @property
    @pulumi.getter(name="vpcEndpoints")
    def vpc_endpoints(self) -> pulumi.Output[Sequence['outputs.EndpointAccessVpcEndpoint']]:
        """
        The connection endpoint for connecting to an Amazon Redshift cluster through the proxy. See details below.
        """
        return pulumi.get(self, "vpc_endpoints")

    @property
    @pulumi.getter(name="vpcSecurityGroupIds")
    def vpc_security_group_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
        """
        return pulumi.get(self, "vpc_security_group_ids")

