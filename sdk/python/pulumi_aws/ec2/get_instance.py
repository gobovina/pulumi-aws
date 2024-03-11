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

__all__ = [
    'GetInstanceResult',
    'AwaitableGetInstanceResult',
    'get_instance',
    'get_instance_output',
]

@pulumi.output_type
class GetInstanceResult:
    """
    A collection of values returned by getInstance.
    """
    def __init__(__self__, ami=None, arn=None, associate_public_ip_address=None, availability_zone=None, credit_specifications=None, disable_api_stop=None, disable_api_termination=None, ebs_block_devices=None, ebs_optimized=None, enclave_options=None, ephemeral_block_devices=None, filters=None, get_password_data=None, get_user_data=None, host_id=None, host_resource_group_arn=None, iam_instance_profile=None, id=None, instance_id=None, instance_state=None, instance_tags=None, instance_type=None, ipv6_addresses=None, key_name=None, maintenance_options=None, metadata_options=None, monitoring=None, network_interface_id=None, outpost_arn=None, password_data=None, placement_group=None, placement_partition_number=None, private_dns=None, private_dns_name_options=None, private_ip=None, public_dns=None, public_ip=None, root_block_devices=None, secondary_private_ips=None, security_groups=None, source_dest_check=None, subnet_id=None, tags=None, tenancy=None, user_data=None, user_data_base64=None, vpc_security_group_ids=None):
        if ami and not isinstance(ami, str):
            raise TypeError("Expected argument 'ami' to be a str")
        pulumi.set(__self__, "ami", ami)
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if associate_public_ip_address and not isinstance(associate_public_ip_address, bool):
            raise TypeError("Expected argument 'associate_public_ip_address' to be a bool")
        pulumi.set(__self__, "associate_public_ip_address", associate_public_ip_address)
        if availability_zone and not isinstance(availability_zone, str):
            raise TypeError("Expected argument 'availability_zone' to be a str")
        pulumi.set(__self__, "availability_zone", availability_zone)
        if credit_specifications and not isinstance(credit_specifications, list):
            raise TypeError("Expected argument 'credit_specifications' to be a list")
        pulumi.set(__self__, "credit_specifications", credit_specifications)
        if disable_api_stop and not isinstance(disable_api_stop, bool):
            raise TypeError("Expected argument 'disable_api_stop' to be a bool")
        pulumi.set(__self__, "disable_api_stop", disable_api_stop)
        if disable_api_termination and not isinstance(disable_api_termination, bool):
            raise TypeError("Expected argument 'disable_api_termination' to be a bool")
        pulumi.set(__self__, "disable_api_termination", disable_api_termination)
        if ebs_block_devices and not isinstance(ebs_block_devices, list):
            raise TypeError("Expected argument 'ebs_block_devices' to be a list")
        pulumi.set(__self__, "ebs_block_devices", ebs_block_devices)
        if ebs_optimized and not isinstance(ebs_optimized, bool):
            raise TypeError("Expected argument 'ebs_optimized' to be a bool")
        pulumi.set(__self__, "ebs_optimized", ebs_optimized)
        if enclave_options and not isinstance(enclave_options, list):
            raise TypeError("Expected argument 'enclave_options' to be a list")
        pulumi.set(__self__, "enclave_options", enclave_options)
        if ephemeral_block_devices and not isinstance(ephemeral_block_devices, list):
            raise TypeError("Expected argument 'ephemeral_block_devices' to be a list")
        pulumi.set(__self__, "ephemeral_block_devices", ephemeral_block_devices)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if get_password_data and not isinstance(get_password_data, bool):
            raise TypeError("Expected argument 'get_password_data' to be a bool")
        pulumi.set(__self__, "get_password_data", get_password_data)
        if get_user_data and not isinstance(get_user_data, bool):
            raise TypeError("Expected argument 'get_user_data' to be a bool")
        pulumi.set(__self__, "get_user_data", get_user_data)
        if host_id and not isinstance(host_id, str):
            raise TypeError("Expected argument 'host_id' to be a str")
        pulumi.set(__self__, "host_id", host_id)
        if host_resource_group_arn and not isinstance(host_resource_group_arn, str):
            raise TypeError("Expected argument 'host_resource_group_arn' to be a str")
        pulumi.set(__self__, "host_resource_group_arn", host_resource_group_arn)
        if iam_instance_profile and not isinstance(iam_instance_profile, str):
            raise TypeError("Expected argument 'iam_instance_profile' to be a str")
        pulumi.set(__self__, "iam_instance_profile", iam_instance_profile)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if instance_state and not isinstance(instance_state, str):
            raise TypeError("Expected argument 'instance_state' to be a str")
        pulumi.set(__self__, "instance_state", instance_state)
        if instance_tags and not isinstance(instance_tags, dict):
            raise TypeError("Expected argument 'instance_tags' to be a dict")
        pulumi.set(__self__, "instance_tags", instance_tags)
        if instance_type and not isinstance(instance_type, str):
            raise TypeError("Expected argument 'instance_type' to be a str")
        pulumi.set(__self__, "instance_type", instance_type)
        if ipv6_addresses and not isinstance(ipv6_addresses, list):
            raise TypeError("Expected argument 'ipv6_addresses' to be a list")
        pulumi.set(__self__, "ipv6_addresses", ipv6_addresses)
        if key_name and not isinstance(key_name, str):
            raise TypeError("Expected argument 'key_name' to be a str")
        pulumi.set(__self__, "key_name", key_name)
        if maintenance_options and not isinstance(maintenance_options, list):
            raise TypeError("Expected argument 'maintenance_options' to be a list")
        pulumi.set(__self__, "maintenance_options", maintenance_options)
        if metadata_options and not isinstance(metadata_options, list):
            raise TypeError("Expected argument 'metadata_options' to be a list")
        pulumi.set(__self__, "metadata_options", metadata_options)
        if monitoring and not isinstance(monitoring, bool):
            raise TypeError("Expected argument 'monitoring' to be a bool")
        pulumi.set(__self__, "monitoring", monitoring)
        if network_interface_id and not isinstance(network_interface_id, str):
            raise TypeError("Expected argument 'network_interface_id' to be a str")
        pulumi.set(__self__, "network_interface_id", network_interface_id)
        if outpost_arn and not isinstance(outpost_arn, str):
            raise TypeError("Expected argument 'outpost_arn' to be a str")
        pulumi.set(__self__, "outpost_arn", outpost_arn)
        if password_data and not isinstance(password_data, str):
            raise TypeError("Expected argument 'password_data' to be a str")
        pulumi.set(__self__, "password_data", password_data)
        if placement_group and not isinstance(placement_group, str):
            raise TypeError("Expected argument 'placement_group' to be a str")
        pulumi.set(__self__, "placement_group", placement_group)
        if placement_partition_number and not isinstance(placement_partition_number, int):
            raise TypeError("Expected argument 'placement_partition_number' to be a int")
        pulumi.set(__self__, "placement_partition_number", placement_partition_number)
        if private_dns and not isinstance(private_dns, str):
            raise TypeError("Expected argument 'private_dns' to be a str")
        pulumi.set(__self__, "private_dns", private_dns)
        if private_dns_name_options and not isinstance(private_dns_name_options, list):
            raise TypeError("Expected argument 'private_dns_name_options' to be a list")
        pulumi.set(__self__, "private_dns_name_options", private_dns_name_options)
        if private_ip and not isinstance(private_ip, str):
            raise TypeError("Expected argument 'private_ip' to be a str")
        pulumi.set(__self__, "private_ip", private_ip)
        if public_dns and not isinstance(public_dns, str):
            raise TypeError("Expected argument 'public_dns' to be a str")
        pulumi.set(__self__, "public_dns", public_dns)
        if public_ip and not isinstance(public_ip, str):
            raise TypeError("Expected argument 'public_ip' to be a str")
        pulumi.set(__self__, "public_ip", public_ip)
        if root_block_devices and not isinstance(root_block_devices, list):
            raise TypeError("Expected argument 'root_block_devices' to be a list")
        pulumi.set(__self__, "root_block_devices", root_block_devices)
        if secondary_private_ips and not isinstance(secondary_private_ips, list):
            raise TypeError("Expected argument 'secondary_private_ips' to be a list")
        pulumi.set(__self__, "secondary_private_ips", secondary_private_ips)
        if security_groups and not isinstance(security_groups, list):
            raise TypeError("Expected argument 'security_groups' to be a list")
        pulumi.set(__self__, "security_groups", security_groups)
        if source_dest_check and not isinstance(source_dest_check, bool):
            raise TypeError("Expected argument 'source_dest_check' to be a bool")
        pulumi.set(__self__, "source_dest_check", source_dest_check)
        if subnet_id and not isinstance(subnet_id, str):
            raise TypeError("Expected argument 'subnet_id' to be a str")
        pulumi.set(__self__, "subnet_id", subnet_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if tenancy and not isinstance(tenancy, str):
            raise TypeError("Expected argument 'tenancy' to be a str")
        pulumi.set(__self__, "tenancy", tenancy)
        if user_data and not isinstance(user_data, str):
            raise TypeError("Expected argument 'user_data' to be a str")
        pulumi.set(__self__, "user_data", user_data)
        if user_data_base64 and not isinstance(user_data_base64, str):
            raise TypeError("Expected argument 'user_data_base64' to be a str")
        pulumi.set(__self__, "user_data_base64", user_data_base64)
        if vpc_security_group_ids and not isinstance(vpc_security_group_ids, list):
            raise TypeError("Expected argument 'vpc_security_group_ids' to be a list")
        pulumi.set(__self__, "vpc_security_group_ids", vpc_security_group_ids)

    @property
    @pulumi.getter
    def ami(self) -> str:
        """
        ID of the AMI used to launch the instance.
        """
        return pulumi.get(self, "ami")

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the instance.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="associatePublicIpAddress")
    def associate_public_ip_address(self) -> bool:
        """
        Whether or not the Instance is associated with a public IP address or not (Boolean).
        """
        return pulumi.get(self, "associate_public_ip_address")

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> str:
        """
        Availability zone of the Instance.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter(name="creditSpecifications")
    def credit_specifications(self) -> Sequence['outputs.GetInstanceCreditSpecificationResult']:
        """
        Credit specification of the Instance.
        """
        return pulumi.get(self, "credit_specifications")

    @property
    @pulumi.getter(name="disableApiStop")
    def disable_api_stop(self) -> bool:
        """
        Whether or not EC2 Instance Stop Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection) is enabled (Boolean).
        """
        return pulumi.get(self, "disable_api_stop")

    @property
    @pulumi.getter(name="disableApiTermination")
    def disable_api_termination(self) -> bool:
        """
        Whether or not [EC2 Instance Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination) is enabled (Boolean).
        """
        return pulumi.get(self, "disable_api_termination")

    @property
    @pulumi.getter(name="ebsBlockDevices")
    def ebs_block_devices(self) -> Sequence['outputs.GetInstanceEbsBlockDeviceResult']:
        """
        EBS block device mappings of the Instance.
        """
        return pulumi.get(self, "ebs_block_devices")

    @property
    @pulumi.getter(name="ebsOptimized")
    def ebs_optimized(self) -> bool:
        """
        Whether the Instance is EBS optimized or not (Boolean).
        """
        return pulumi.get(self, "ebs_optimized")

    @property
    @pulumi.getter(name="enclaveOptions")
    def enclave_options(self) -> Sequence['outputs.GetInstanceEnclaveOptionResult']:
        """
        Enclave options of the instance.
        """
        return pulumi.get(self, "enclave_options")

    @property
    @pulumi.getter(name="ephemeralBlockDevices")
    def ephemeral_block_devices(self) -> Sequence['outputs.GetInstanceEphemeralBlockDeviceResult']:
        """
        Ephemeral block device mappings of the Instance.
        """
        return pulumi.get(self, "ephemeral_block_devices")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetInstanceFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter(name="getPasswordData")
    def get_password_data(self) -> Optional[bool]:
        return pulumi.get(self, "get_password_data")

    @property
    @pulumi.getter(name="getUserData")
    def get_user_data(self) -> Optional[bool]:
        return pulumi.get(self, "get_user_data")

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> str:
        """
        ID of the dedicated host the instance will be assigned to.
        """
        return pulumi.get(self, "host_id")

    @property
    @pulumi.getter(name="hostResourceGroupArn")
    def host_resource_group_arn(self) -> str:
        """
        ARN of the host resource group the instance is associated with.
        """
        return pulumi.get(self, "host_resource_group_arn")

    @property
    @pulumi.getter(name="iamInstanceProfile")
    def iam_instance_profile(self) -> str:
        """
        Name of the instance profile associated with the Instance.
        """
        return pulumi.get(self, "iam_instance_profile")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[str]:
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="instanceState")
    def instance_state(self) -> str:
        """
        State of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
        """
        return pulumi.get(self, "instance_state")

    @property
    @pulumi.getter(name="instanceTags")
    def instance_tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "instance_tags")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> str:
        """
        Type of the Instance.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="ipv6Addresses")
    def ipv6_addresses(self) -> Sequence[str]:
        """
        IPv6 addresses associated to the Instance, if applicable. **NOTE**: Unlike the IPv4 address, this doesn't change if you attach an EIP to the instance.
        """
        return pulumi.get(self, "ipv6_addresses")

    @property
    @pulumi.getter(name="keyName")
    def key_name(self) -> str:
        """
        Key name of the Instance.
        """
        return pulumi.get(self, "key_name")

    @property
    @pulumi.getter(name="maintenanceOptions")
    def maintenance_options(self) -> Sequence['outputs.GetInstanceMaintenanceOptionResult']:
        """
        Maintenance and recovery options for the instance.
        """
        return pulumi.get(self, "maintenance_options")

    @property
    @pulumi.getter(name="metadataOptions")
    def metadata_options(self) -> Sequence['outputs.GetInstanceMetadataOptionResult']:
        """
        Metadata options of the Instance.
        """
        return pulumi.get(self, "metadata_options")

    @property
    @pulumi.getter
    def monitoring(self) -> bool:
        """
        Whether detailed monitoring is enabled or disabled for the Instance (Boolean).
        """
        return pulumi.get(self, "monitoring")

    @property
    @pulumi.getter(name="networkInterfaceId")
    def network_interface_id(self) -> str:
        """
        ID of the network interface that was created with the Instance.
        """
        return pulumi.get(self, "network_interface_id")

    @property
    @pulumi.getter(name="outpostArn")
    def outpost_arn(self) -> str:
        """
        ARN of the Outpost.
        """
        return pulumi.get(self, "outpost_arn")

    @property
    @pulumi.getter(name="passwordData")
    def password_data(self) -> str:
        """
        Base-64 encoded encrypted password data for the instance. Useful for getting the administrator password for instances running Microsoft Windows. This attribute is only exported if `get_password_data` is true. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
        """
        return pulumi.get(self, "password_data")

    @property
    @pulumi.getter(name="placementGroup")
    def placement_group(self) -> str:
        """
        Placement group of the Instance.
        """
        return pulumi.get(self, "placement_group")

    @property
    @pulumi.getter(name="placementPartitionNumber")
    def placement_partition_number(self) -> int:
        """
        Number of the partition the instance is in.
        """
        return pulumi.get(self, "placement_partition_number")

    @property
    @pulumi.getter(name="privateDns")
    def private_dns(self) -> str:
        """
        Private DNS name assigned to the Instance. Can only be used inside the Amazon EC2, and only available if you've enabled DNS hostnames for your VPC.
        """
        return pulumi.get(self, "private_dns")

    @property
    @pulumi.getter(name="privateDnsNameOptions")
    def private_dns_name_options(self) -> Sequence['outputs.GetInstancePrivateDnsNameOptionResult']:
        """
        Options for the instance hostname.
        """
        return pulumi.get(self, "private_dns_name_options")

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> str:
        """
        Private IP address assigned to the Instance.
        """
        return pulumi.get(self, "private_ip")

    @property
    @pulumi.getter(name="publicDns")
    def public_dns(self) -> str:
        """
        Public DNS name assigned to the Instance. For EC2-VPC, this is only available if you've enabled DNS hostnames for your VPC.
        """
        return pulumi.get(self, "public_dns")

    @property
    @pulumi.getter(name="publicIp")
    def public_ip(self) -> str:
        """
        Public IP address assigned to the Instance, if applicable. **NOTE**: If you are using an `ec2.Eip` with your instance, you should refer to the EIP's address directly and not use `public_ip`, as this field will change after the EIP is attached.
        """
        return pulumi.get(self, "public_ip")

    @property
    @pulumi.getter(name="rootBlockDevices")
    def root_block_devices(self) -> Sequence['outputs.GetInstanceRootBlockDeviceResult']:
        """
        Root block device mappings of the Instance
        """
        return pulumi.get(self, "root_block_devices")

    @property
    @pulumi.getter(name="secondaryPrivateIps")
    def secondary_private_ips(self) -> Sequence[str]:
        """
        Secondary private IPv4 addresses assigned to the instance's primary network interface (eth0) in a VPC.
        """
        return pulumi.get(self, "secondary_private_ips")

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Sequence[str]:
        """
        Associated security groups.
        """
        return pulumi.get(self, "security_groups")

    @property
    @pulumi.getter(name="sourceDestCheck")
    def source_dest_check(self) -> bool:
        """
        Whether the network interface performs source/destination checking (Boolean).
        """
        return pulumi.get(self, "source_dest_check")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> str:
        """
        VPC subnet ID.
        """
        return pulumi.get(self, "subnet_id")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Map of tags assigned to the Instance.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def tenancy(self) -> str:
        """
        Tenancy of the instance: `dedicated`, `default`, `host`.
        """
        return pulumi.get(self, "tenancy")

    @property
    @pulumi.getter(name="userData")
    def user_data(self) -> str:
        """
        SHA-1 hash of User Data supplied to the Instance.
        """
        return pulumi.get(self, "user_data")

    @property
    @pulumi.getter(name="userDataBase64")
    def user_data_base64(self) -> str:
        """
        Base64 encoded contents of User Data supplied to the Instance. This attribute is only exported if `get_user_data` is true.
        """
        return pulumi.get(self, "user_data_base64")

    @property
    @pulumi.getter(name="vpcSecurityGroupIds")
    def vpc_security_group_ids(self) -> Sequence[str]:
        """
        Associated security groups in a non-default VPC.
        """
        return pulumi.get(self, "vpc_security_group_ids")


class AwaitableGetInstanceResult(GetInstanceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceResult(
            ami=self.ami,
            arn=self.arn,
            associate_public_ip_address=self.associate_public_ip_address,
            availability_zone=self.availability_zone,
            credit_specifications=self.credit_specifications,
            disable_api_stop=self.disable_api_stop,
            disable_api_termination=self.disable_api_termination,
            ebs_block_devices=self.ebs_block_devices,
            ebs_optimized=self.ebs_optimized,
            enclave_options=self.enclave_options,
            ephemeral_block_devices=self.ephemeral_block_devices,
            filters=self.filters,
            get_password_data=self.get_password_data,
            get_user_data=self.get_user_data,
            host_id=self.host_id,
            host_resource_group_arn=self.host_resource_group_arn,
            iam_instance_profile=self.iam_instance_profile,
            id=self.id,
            instance_id=self.instance_id,
            instance_state=self.instance_state,
            instance_tags=self.instance_tags,
            instance_type=self.instance_type,
            ipv6_addresses=self.ipv6_addresses,
            key_name=self.key_name,
            maintenance_options=self.maintenance_options,
            metadata_options=self.metadata_options,
            monitoring=self.monitoring,
            network_interface_id=self.network_interface_id,
            outpost_arn=self.outpost_arn,
            password_data=self.password_data,
            placement_group=self.placement_group,
            placement_partition_number=self.placement_partition_number,
            private_dns=self.private_dns,
            private_dns_name_options=self.private_dns_name_options,
            private_ip=self.private_ip,
            public_dns=self.public_dns,
            public_ip=self.public_ip,
            root_block_devices=self.root_block_devices,
            secondary_private_ips=self.secondary_private_ips,
            security_groups=self.security_groups,
            source_dest_check=self.source_dest_check,
            subnet_id=self.subnet_id,
            tags=self.tags,
            tenancy=self.tenancy,
            user_data=self.user_data,
            user_data_base64=self.user_data_base64,
            vpc_security_group_ids=self.vpc_security_group_ids)


def get_instance(filters: Optional[Sequence[pulumi.InputType['GetInstanceFilterArgs']]] = None,
                 get_password_data: Optional[bool] = None,
                 get_user_data: Optional[bool] = None,
                 instance_id: Optional[str] = None,
                 instance_tags: Optional[Mapping[str, str]] = None,
                 tags: Optional[Mapping[str, str]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceResult:
    """
    Use this data source to get the ID of an Amazon EC2 Instance for use in other resources.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    foo = aws.ec2.get_instance(instance_id="i-instanceid",
        filters=[
            aws.ec2.GetInstanceFilterArgs(
                name="image-id",
                values=["ami-xxxxxxxx"],
            ),
            aws.ec2.GetInstanceFilterArgs(
                name="tag:Name",
                values=["instance-name-tag"],
            ),
        ])
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetInstanceFilterArgs']] filters: One or more name/value pairs to use as filters. There are
           several valid keys, for a full reference, check out
           [describe-instances in the AWS CLI reference][1].
    :param bool get_password_data: If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `password_data` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    :param bool get_user_data: Retrieve Base64 encoded User Data contents into the `user_data_base64` attribute. A SHA-1 hash of the User Data contents will always be present in the `user_data` attribute. Defaults to `false`.
           
           > **NOTE:** At least one of `filter`, `instance_tags`, or `instance_id` must be specified.
           
           > **NOTE:** If anything other than a single match is returned by the search,
           this call will fail. Ensure that your search is specific enough to return
           a single Instance ID only.
    :param str instance_id: Specify the exact Instance ID with which to populate the data source.
    :param Mapping[str, str] instance_tags: Map of tags, each pair of which must
           exactly match a pair on the desired Instance.
    :param Mapping[str, str] tags: Map of tags assigned to the Instance.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['getPasswordData'] = get_password_data
    __args__['getUserData'] = get_user_data
    __args__['instanceId'] = instance_id
    __args__['instanceTags'] = instance_tags
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ec2/getInstance:getInstance', __args__, opts=opts, typ=GetInstanceResult).value

    return AwaitableGetInstanceResult(
        ami=pulumi.get(__ret__, 'ami'),
        arn=pulumi.get(__ret__, 'arn'),
        associate_public_ip_address=pulumi.get(__ret__, 'associate_public_ip_address'),
        availability_zone=pulumi.get(__ret__, 'availability_zone'),
        credit_specifications=pulumi.get(__ret__, 'credit_specifications'),
        disable_api_stop=pulumi.get(__ret__, 'disable_api_stop'),
        disable_api_termination=pulumi.get(__ret__, 'disable_api_termination'),
        ebs_block_devices=pulumi.get(__ret__, 'ebs_block_devices'),
        ebs_optimized=pulumi.get(__ret__, 'ebs_optimized'),
        enclave_options=pulumi.get(__ret__, 'enclave_options'),
        ephemeral_block_devices=pulumi.get(__ret__, 'ephemeral_block_devices'),
        filters=pulumi.get(__ret__, 'filters'),
        get_password_data=pulumi.get(__ret__, 'get_password_data'),
        get_user_data=pulumi.get(__ret__, 'get_user_data'),
        host_id=pulumi.get(__ret__, 'host_id'),
        host_resource_group_arn=pulumi.get(__ret__, 'host_resource_group_arn'),
        iam_instance_profile=pulumi.get(__ret__, 'iam_instance_profile'),
        id=pulumi.get(__ret__, 'id'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        instance_state=pulumi.get(__ret__, 'instance_state'),
        instance_tags=pulumi.get(__ret__, 'instance_tags'),
        instance_type=pulumi.get(__ret__, 'instance_type'),
        ipv6_addresses=pulumi.get(__ret__, 'ipv6_addresses'),
        key_name=pulumi.get(__ret__, 'key_name'),
        maintenance_options=pulumi.get(__ret__, 'maintenance_options'),
        metadata_options=pulumi.get(__ret__, 'metadata_options'),
        monitoring=pulumi.get(__ret__, 'monitoring'),
        network_interface_id=pulumi.get(__ret__, 'network_interface_id'),
        outpost_arn=pulumi.get(__ret__, 'outpost_arn'),
        password_data=pulumi.get(__ret__, 'password_data'),
        placement_group=pulumi.get(__ret__, 'placement_group'),
        placement_partition_number=pulumi.get(__ret__, 'placement_partition_number'),
        private_dns=pulumi.get(__ret__, 'private_dns'),
        private_dns_name_options=pulumi.get(__ret__, 'private_dns_name_options'),
        private_ip=pulumi.get(__ret__, 'private_ip'),
        public_dns=pulumi.get(__ret__, 'public_dns'),
        public_ip=pulumi.get(__ret__, 'public_ip'),
        root_block_devices=pulumi.get(__ret__, 'root_block_devices'),
        secondary_private_ips=pulumi.get(__ret__, 'secondary_private_ips'),
        security_groups=pulumi.get(__ret__, 'security_groups'),
        source_dest_check=pulumi.get(__ret__, 'source_dest_check'),
        subnet_id=pulumi.get(__ret__, 'subnet_id'),
        tags=pulumi.get(__ret__, 'tags'),
        tenancy=pulumi.get(__ret__, 'tenancy'),
        user_data=pulumi.get(__ret__, 'user_data'),
        user_data_base64=pulumi.get(__ret__, 'user_data_base64'),
        vpc_security_group_ids=pulumi.get(__ret__, 'vpc_security_group_ids'))


@_utilities.lift_output_func(get_instance)
def get_instance_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetInstanceFilterArgs']]]]] = None,
                        get_password_data: Optional[pulumi.Input[Optional[bool]]] = None,
                        get_user_data: Optional[pulumi.Input[Optional[bool]]] = None,
                        instance_id: Optional[pulumi.Input[Optional[str]]] = None,
                        instance_tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                        tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstanceResult]:
    """
    Use this data source to get the ID of an Amazon EC2 Instance for use in other resources.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    foo = aws.ec2.get_instance(instance_id="i-instanceid",
        filters=[
            aws.ec2.GetInstanceFilterArgs(
                name="image-id",
                values=["ami-xxxxxxxx"],
            ),
            aws.ec2.GetInstanceFilterArgs(
                name="tag:Name",
                values=["instance-name-tag"],
            ),
        ])
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetInstanceFilterArgs']] filters: One or more name/value pairs to use as filters. There are
           several valid keys, for a full reference, check out
           [describe-instances in the AWS CLI reference][1].
    :param bool get_password_data: If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `password_data` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    :param bool get_user_data: Retrieve Base64 encoded User Data contents into the `user_data_base64` attribute. A SHA-1 hash of the User Data contents will always be present in the `user_data` attribute. Defaults to `false`.
           
           > **NOTE:** At least one of `filter`, `instance_tags`, or `instance_id` must be specified.
           
           > **NOTE:** If anything other than a single match is returned by the search,
           this call will fail. Ensure that your search is specific enough to return
           a single Instance ID only.
    :param str instance_id: Specify the exact Instance ID with which to populate the data source.
    :param Mapping[str, str] instance_tags: Map of tags, each pair of which must
           exactly match a pair on the desired Instance.
    :param Mapping[str, str] tags: Map of tags assigned to the Instance.
    """
    ...
