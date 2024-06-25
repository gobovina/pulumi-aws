# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['DelegationSetArgs', 'DelegationSet']

@pulumi.input_type
class DelegationSetArgs:
    def __init__(__self__, *,
                 reference_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DelegationSet resource.
        :param pulumi.Input[str] reference_name: This is a reference name used in Caller Reference
               (helpful for identifying single delegation set amongst others)
        """
        if reference_name is not None:
            pulumi.set(__self__, "reference_name", reference_name)

    @property
    @pulumi.getter(name="referenceName")
    def reference_name(self) -> Optional[pulumi.Input[str]]:
        """
        This is a reference name used in Caller Reference
        (helpful for identifying single delegation set amongst others)
        """
        return pulumi.get(self, "reference_name")

    @reference_name.setter
    def reference_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reference_name", value)


@pulumi.input_type
class _DelegationSetState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 reference_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DelegationSet resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the Delegation Set.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] name_servers: A list of authoritative name servers for the hosted zone
               (effectively a list of NS records).
        :param pulumi.Input[str] reference_name: This is a reference name used in Caller Reference
               (helpful for identifying single delegation set amongst others)
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if name_servers is not None:
            pulumi.set(__self__, "name_servers", name_servers)
        if reference_name is not None:
            pulumi.set(__self__, "reference_name", reference_name)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the Delegation Set.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="nameServers")
    def name_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of authoritative name servers for the hosted zone
        (effectively a list of NS records).
        """
        return pulumi.get(self, "name_servers")

    @name_servers.setter
    def name_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "name_servers", value)

    @property
    @pulumi.getter(name="referenceName")
    def reference_name(self) -> Optional[pulumi.Input[str]]:
        """
        This is a reference name used in Caller Reference
        (helpful for identifying single delegation set amongst others)
        """
        return pulumi.get(self, "reference_name")

    @reference_name.setter
    def reference_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reference_name", value)


class DelegationSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 reference_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a [Route53 Delegation Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API-actions-by-function.html#actions-by-function-reusable-delegation-sets) resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        main = aws.route53.DelegationSet("main", reference_name="DynDNS")
        primary = aws.route53.Zone("primary",
            name="mydomain.com",
            delegation_set_id=main.id)
        secondary = aws.route53.Zone("secondary",
            name="coolcompany.io",
            delegation_set_id=main.id)
        ```

        ## Import

        Using `pulumi import`, import Route53 Delegation Sets using the delegation set `id`. For example:

        ```sh
        $ pulumi import aws:route53/delegationSet:DelegationSet set1 N1PA6795SAMPLE
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] reference_name: This is a reference name used in Caller Reference
               (helpful for identifying single delegation set amongst others)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DelegationSetArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a [Route53 Delegation Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API-actions-by-function.html#actions-by-function-reusable-delegation-sets) resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        main = aws.route53.DelegationSet("main", reference_name="DynDNS")
        primary = aws.route53.Zone("primary",
            name="mydomain.com",
            delegation_set_id=main.id)
        secondary = aws.route53.Zone("secondary",
            name="coolcompany.io",
            delegation_set_id=main.id)
        ```

        ## Import

        Using `pulumi import`, import Route53 Delegation Sets using the delegation set `id`. For example:

        ```sh
        $ pulumi import aws:route53/delegationSet:DelegationSet set1 N1PA6795SAMPLE
        ```

        :param str resource_name: The name of the resource.
        :param DelegationSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DelegationSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 reference_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DelegationSetArgs.__new__(DelegationSetArgs)

            __props__.__dict__["reference_name"] = reference_name
            __props__.__dict__["arn"] = None
            __props__.__dict__["name_servers"] = None
        super(DelegationSet, __self__).__init__(
            'aws:route53/delegationSet:DelegationSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            reference_name: Optional[pulumi.Input[str]] = None) -> 'DelegationSet':
        """
        Get an existing DelegationSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the Delegation Set.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] name_servers: A list of authoritative name servers for the hosted zone
               (effectively a list of NS records).
        :param pulumi.Input[str] reference_name: This is a reference name used in Caller Reference
               (helpful for identifying single delegation set amongst others)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DelegationSetState.__new__(_DelegationSetState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["name_servers"] = name_servers
        __props__.__dict__["reference_name"] = reference_name
        return DelegationSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the Delegation Set.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="nameServers")
    def name_servers(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of authoritative name servers for the hosted zone
        (effectively a list of NS records).
        """
        return pulumi.get(self, "name_servers")

    @property
    @pulumi.getter(name="referenceName")
    def reference_name(self) -> pulumi.Output[Optional[str]]:
        """
        This is a reference name used in Caller Reference
        (helpful for identifying single delegation set amongst others)
        """
        return pulumi.get(self, "reference_name")

