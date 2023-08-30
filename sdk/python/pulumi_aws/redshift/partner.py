# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PartnerArgs', 'Partner']

@pulumi.input_type
class PartnerArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 cluster_identifier: pulumi.Input[str],
                 database_name: pulumi.Input[str],
                 partner_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a Partner resource.
        :param pulumi.Input[str] account_id: The Amazon Web Services account ID that owns the cluster.
        :param pulumi.Input[str] cluster_identifier: The cluster identifier of the cluster that receives data from the partner.
        :param pulumi.Input[str] database_name: The name of the database that receives data from the partner.
        :param pulumi.Input[str] partner_name: The name of the partner that is authorized to send data.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "cluster_identifier", cluster_identifier)
        pulumi.set(__self__, "database_name", database_name)
        pulumi.set(__self__, "partner_name", partner_name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The Amazon Web Services account ID that owns the cluster.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="clusterIdentifier")
    def cluster_identifier(self) -> pulumi.Input[str]:
        """
        The cluster identifier of the cluster that receives data from the partner.
        """
        return pulumi.get(self, "cluster_identifier")

    @cluster_identifier.setter
    def cluster_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_identifier", value)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Input[str]:
        """
        The name of the database that receives data from the partner.
        """
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "database_name", value)

    @property
    @pulumi.getter(name="partnerName")
    def partner_name(self) -> pulumi.Input[str]:
        """
        The name of the partner that is authorized to send data.
        """
        return pulumi.get(self, "partner_name")

    @partner_name.setter
    def partner_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "partner_name", value)


@pulumi.input_type
class _PartnerState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cluster_identifier: Optional[pulumi.Input[str]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 partner_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 status_message: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Partner resources.
        :param pulumi.Input[str] account_id: The Amazon Web Services account ID that owns the cluster.
        :param pulumi.Input[str] cluster_identifier: The cluster identifier of the cluster that receives data from the partner.
        :param pulumi.Input[str] database_name: The name of the database that receives data from the partner.
        :param pulumi.Input[str] partner_name: The name of the partner that is authorized to send data.
        :param pulumi.Input[str] status: (Optional) The partner integration status.
        :param pulumi.Input[str] status_message: (Optional) The status message provided by the partner.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if cluster_identifier is not None:
            pulumi.set(__self__, "cluster_identifier", cluster_identifier)
        if database_name is not None:
            pulumi.set(__self__, "database_name", database_name)
        if partner_name is not None:
            pulumi.set(__self__, "partner_name", partner_name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if status_message is not None:
            pulumi.set(__self__, "status_message", status_message)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Web Services account ID that owns the cluster.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="clusterIdentifier")
    def cluster_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster identifier of the cluster that receives data from the partner.
        """
        return pulumi.get(self, "cluster_identifier")

    @cluster_identifier.setter
    def cluster_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_identifier", value)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the database that receives data from the partner.
        """
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database_name", value)

    @property
    @pulumi.getter(name="partnerName")
    def partner_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the partner that is authorized to send data.
        """
        return pulumi.get(self, "partner_name")

    @partner_name.setter
    def partner_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "partner_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional) The partner integration status.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional) The status message provided by the partner.
        """
        return pulumi.get(self, "status_message")

    @status_message.setter
    def status_message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status_message", value)


class Partner(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cluster_identifier: Optional[pulumi.Input[str]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 partner_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a new Amazon Redshift Partner Integration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.redshift.Partner("example",
            cluster_identifier=aws_redshift_cluster["example"]["id"],
            account_id="1234567910",
            database_name=aws_redshift_cluster["example"]["database_name"],
            partner_name="example")
        ```

        ## Import

        Using `pulumi import`, import Redshift usage limits using the `id`. For example:

        ```sh
         $ pulumi import aws:redshift/partner:Partner example 01234567910:cluster-example-id:example:example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The Amazon Web Services account ID that owns the cluster.
        :param pulumi.Input[str] cluster_identifier: The cluster identifier of the cluster that receives data from the partner.
        :param pulumi.Input[str] database_name: The name of the database that receives data from the partner.
        :param pulumi.Input[str] partner_name: The name of the partner that is authorized to send data.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PartnerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a new Amazon Redshift Partner Integration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.redshift.Partner("example",
            cluster_identifier=aws_redshift_cluster["example"]["id"],
            account_id="1234567910",
            database_name=aws_redshift_cluster["example"]["database_name"],
            partner_name="example")
        ```

        ## Import

        Using `pulumi import`, import Redshift usage limits using the `id`. For example:

        ```sh
         $ pulumi import aws:redshift/partner:Partner example 01234567910:cluster-example-id:example:example
        ```

        :param str resource_name: The name of the resource.
        :param PartnerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PartnerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cluster_identifier: Optional[pulumi.Input[str]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 partner_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PartnerArgs.__new__(PartnerArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if cluster_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_identifier'")
            __props__.__dict__["cluster_identifier"] = cluster_identifier
            if database_name is None and not opts.urn:
                raise TypeError("Missing required property 'database_name'")
            __props__.__dict__["database_name"] = database_name
            if partner_name is None and not opts.urn:
                raise TypeError("Missing required property 'partner_name'")
            __props__.__dict__["partner_name"] = partner_name
            __props__.__dict__["status"] = None
            __props__.__dict__["status_message"] = None
        super(Partner, __self__).__init__(
            'aws:redshift/partner:Partner',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            cluster_identifier: Optional[pulumi.Input[str]] = None,
            database_name: Optional[pulumi.Input[str]] = None,
            partner_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            status_message: Optional[pulumi.Input[str]] = None) -> 'Partner':
        """
        Get an existing Partner resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The Amazon Web Services account ID that owns the cluster.
        :param pulumi.Input[str] cluster_identifier: The cluster identifier of the cluster that receives data from the partner.
        :param pulumi.Input[str] database_name: The name of the database that receives data from the partner.
        :param pulumi.Input[str] partner_name: The name of the partner that is authorized to send data.
        :param pulumi.Input[str] status: (Optional) The partner integration status.
        :param pulumi.Input[str] status_message: (Optional) The status message provided by the partner.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PartnerState.__new__(_PartnerState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["cluster_identifier"] = cluster_identifier
        __props__.__dict__["database_name"] = database_name
        __props__.__dict__["partner_name"] = partner_name
        __props__.__dict__["status"] = status
        __props__.__dict__["status_message"] = status_message
        return Partner(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The Amazon Web Services account ID that owns the cluster.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="clusterIdentifier")
    def cluster_identifier(self) -> pulumi.Output[str]:
        """
        The cluster identifier of the cluster that receives data from the partner.
        """
        return pulumi.get(self, "cluster_identifier")

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Output[str]:
        """
        The name of the database that receives data from the partner.
        """
        return pulumi.get(self, "database_name")

    @property
    @pulumi.getter(name="partnerName")
    def partner_name(self) -> pulumi.Output[str]:
        """
        The name of the partner that is authorized to send data.
        """
        return pulumi.get(self, "partner_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        (Optional) The partner integration status.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> pulumi.Output[str]:
        """
        (Optional) The status message provided by the partner.
        """
        return pulumi.get(self, "status_message")

