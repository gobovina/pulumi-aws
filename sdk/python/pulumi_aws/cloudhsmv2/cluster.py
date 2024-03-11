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

__all__ = ['ClusterArgs', 'Cluster']

@pulumi.input_type
class ClusterArgs:
    def __init__(__self__, *,
                 hsm_type: pulumi.Input[str],
                 subnet_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 source_backup_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Cluster resource.
        :param pulumi.Input[str] hsm_type: The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: The IDs of subnets in which cluster will operate.
        :param pulumi.Input[str] source_backup_identifier: ID of Cloud HSM v2 cluster backup to be restored.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "hsm_type", hsm_type)
        pulumi.set(__self__, "subnet_ids", subnet_ids)
        if source_backup_identifier is not None:
            pulumi.set(__self__, "source_backup_identifier", source_backup_identifier)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="hsmType")
    def hsm_type(self) -> pulumi.Input[str]:
        """
        The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
        """
        return pulumi.get(self, "hsm_type")

    @hsm_type.setter
    def hsm_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "hsm_type", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The IDs of subnets in which cluster will operate.
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter(name="sourceBackupIdentifier")
    def source_backup_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        ID of Cloud HSM v2 cluster backup to be restored.
        """
        return pulumi.get(self, "source_backup_identifier")

    @source_backup_identifier.setter
    def source_backup_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_backup_identifier", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ClusterState:
    def __init__(__self__, *,
                 cluster_certificates: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterClusterCertificateArgs']]]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 cluster_state: Optional[pulumi.Input[str]] = None,
                 hsm_type: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 source_backup_identifier: Optional[pulumi.Input[str]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Cluster resources.
        :param pulumi.Input[Sequence[pulumi.Input['ClusterClusterCertificateArgs']]] cluster_certificates: The list of cluster certificates.
               * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
               * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in `UNINITIALIZED` state after an HSM instance is added to the cluster.
               * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
               * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
               * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
        :param pulumi.Input[str] cluster_id: The id of the CloudHSM cluster.
        :param pulumi.Input[str] cluster_state: The state of the CloudHSM cluster.
        :param pulumi.Input[str] hsm_type: The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
        :param pulumi.Input[str] security_group_id: The ID of the security group associated with the CloudHSM cluster.
        :param pulumi.Input[str] source_backup_identifier: ID of Cloud HSM v2 cluster backup to be restored.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: The IDs of subnets in which cluster will operate.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] vpc_id: The id of the VPC that the CloudHSM cluster resides in.
        """
        if cluster_certificates is not None:
            pulumi.set(__self__, "cluster_certificates", cluster_certificates)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if cluster_state is not None:
            pulumi.set(__self__, "cluster_state", cluster_state)
        if hsm_type is not None:
            pulumi.set(__self__, "hsm_type", hsm_type)
        if security_group_id is not None:
            pulumi.set(__self__, "security_group_id", security_group_id)
        if source_backup_identifier is not None:
            pulumi.set(__self__, "source_backup_identifier", source_backup_identifier)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="clusterCertificates")
    def cluster_certificates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ClusterClusterCertificateArgs']]]]:
        """
        The list of cluster certificates.
        * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
        * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in `UNINITIALIZED` state after an HSM instance is added to the cluster.
        * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
        * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
        * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
        """
        return pulumi.get(self, "cluster_certificates")

    @cluster_certificates.setter
    def cluster_certificates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterClusterCertificateArgs']]]]):
        pulumi.set(self, "cluster_certificates", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the CloudHSM cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="clusterState")
    def cluster_state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the CloudHSM cluster.
        """
        return pulumi.get(self, "cluster_state")

    @cluster_state.setter
    def cluster_state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_state", value)

    @property
    @pulumi.getter(name="hsmType")
    def hsm_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
        """
        return pulumi.get(self, "hsm_type")

    @hsm_type.setter
    def hsm_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hsm_type", value)

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the security group associated with the CloudHSM cluster.
        """
        return pulumi.get(self, "security_group_id")

    @security_group_id.setter
    def security_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_id", value)

    @property
    @pulumi.getter(name="sourceBackupIdentifier")
    def source_backup_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        ID of Cloud HSM v2 cluster backup to be restored.
        """
        return pulumi.get(self, "source_backup_identifier")

    @source_backup_identifier.setter
    def source_backup_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_backup_identifier", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The IDs of subnets in which cluster will operate.
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the VPC that the CloudHSM cluster resides in.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class Cluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hsm_type: Optional[pulumi.Input[str]] = None,
                 source_backup_identifier: Optional[pulumi.Input[str]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Creates an Amazon CloudHSM v2 cluster.

        For information about CloudHSM v2, see the
        [AWS CloudHSM User Guide](https://docs.aws.amazon.com/cloudhsm/latest/userguide/introduction.html) and the [Amazon
        CloudHSM API Reference][2].

        > **NOTE:** A CloudHSM Cluster can take several minutes to set up.
        Practically no single attribute can be updated, except for `tags`.
        If you need to delete a cluster, you have to remove its HSM modules first.
        To initialize cluster, you have to add an HSM instance to the cluster, then sign CSR and upload it.

        ## Import

        Using `pulumi import`, import CloudHSM v2 Clusters using the cluster `id`. For example:

        ```sh
        $ pulumi import aws:cloudhsmv2/cluster:Cluster test_cluster cluster-aeb282a201
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hsm_type: The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
        :param pulumi.Input[str] source_backup_identifier: ID of Cloud HSM v2 cluster backup to be restored.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: The IDs of subnets in which cluster will operate.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates an Amazon CloudHSM v2 cluster.

        For information about CloudHSM v2, see the
        [AWS CloudHSM User Guide](https://docs.aws.amazon.com/cloudhsm/latest/userguide/introduction.html) and the [Amazon
        CloudHSM API Reference][2].

        > **NOTE:** A CloudHSM Cluster can take several minutes to set up.
        Practically no single attribute can be updated, except for `tags`.
        If you need to delete a cluster, you have to remove its HSM modules first.
        To initialize cluster, you have to add an HSM instance to the cluster, then sign CSR and upload it.

        ## Import

        Using `pulumi import`, import CloudHSM v2 Clusters using the cluster `id`. For example:

        ```sh
        $ pulumi import aws:cloudhsmv2/cluster:Cluster test_cluster cluster-aeb282a201
        ```

        :param str resource_name: The name of the resource.
        :param ClusterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hsm_type: Optional[pulumi.Input[str]] = None,
                 source_backup_identifier: Optional[pulumi.Input[str]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClusterArgs.__new__(ClusterArgs)

            if hsm_type is None and not opts.urn:
                raise TypeError("Missing required property 'hsm_type'")
            __props__.__dict__["hsm_type"] = hsm_type
            __props__.__dict__["source_backup_identifier"] = source_backup_identifier
            if subnet_ids is None and not opts.urn:
                raise TypeError("Missing required property 'subnet_ids'")
            __props__.__dict__["subnet_ids"] = subnet_ids
            __props__.__dict__["tags"] = tags
            __props__.__dict__["cluster_certificates"] = None
            __props__.__dict__["cluster_id"] = None
            __props__.__dict__["cluster_state"] = None
            __props__.__dict__["security_group_id"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["vpc_id"] = None
        super(Cluster, __self__).__init__(
            'aws:cloudhsmv2/cluster:Cluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_certificates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterClusterCertificateArgs']]]]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            cluster_state: Optional[pulumi.Input[str]] = None,
            hsm_type: Optional[pulumi.Input[str]] = None,
            security_group_id: Optional[pulumi.Input[str]] = None,
            source_backup_identifier: Optional[pulumi.Input[str]] = None,
            subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'Cluster':
        """
        Get an existing Cluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterClusterCertificateArgs']]]] cluster_certificates: The list of cluster certificates.
               * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
               * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in `UNINITIALIZED` state after an HSM instance is added to the cluster.
               * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
               * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
               * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
        :param pulumi.Input[str] cluster_id: The id of the CloudHSM cluster.
        :param pulumi.Input[str] cluster_state: The state of the CloudHSM cluster.
        :param pulumi.Input[str] hsm_type: The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
        :param pulumi.Input[str] security_group_id: The ID of the security group associated with the CloudHSM cluster.
        :param pulumi.Input[str] source_backup_identifier: ID of Cloud HSM v2 cluster backup to be restored.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: The IDs of subnets in which cluster will operate.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] vpc_id: The id of the VPC that the CloudHSM cluster resides in.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClusterState.__new__(_ClusterState)

        __props__.__dict__["cluster_certificates"] = cluster_certificates
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["cluster_state"] = cluster_state
        __props__.__dict__["hsm_type"] = hsm_type
        __props__.__dict__["security_group_id"] = security_group_id
        __props__.__dict__["source_backup_identifier"] = source_backup_identifier
        __props__.__dict__["subnet_ids"] = subnet_ids
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["vpc_id"] = vpc_id
        return Cluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterCertificates")
    def cluster_certificates(self) -> pulumi.Output[Sequence['outputs.ClusterClusterCertificate']]:
        """
        The list of cluster certificates.
        * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
        * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in `UNINITIALIZED` state after an HSM instance is added to the cluster.
        * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
        * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
        * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
        """
        return pulumi.get(self, "cluster_certificates")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The id of the CloudHSM cluster.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterState")
    def cluster_state(self) -> pulumi.Output[str]:
        """
        The state of the CloudHSM cluster.
        """
        return pulumi.get(self, "cluster_state")

    @property
    @pulumi.getter(name="hsmType")
    def hsm_type(self) -> pulumi.Output[str]:
        """
        The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
        """
        return pulumi.get(self, "hsm_type")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the security group associated with the CloudHSM cluster.
        """
        return pulumi.get(self, "security_group_id")

    @property
    @pulumi.getter(name="sourceBackupIdentifier")
    def source_backup_identifier(self) -> pulumi.Output[Optional[str]]:
        """
        ID of Cloud HSM v2 cluster backup to be restored.
        """
        return pulumi.get(self, "source_backup_identifier")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        The IDs of subnets in which cluster will operate.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The id of the VPC that the CloudHSM cluster resides in.
        """
        return pulumi.get(self, "vpc_id")

