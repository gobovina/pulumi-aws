# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['NetworkProfileArgs', 'NetworkProfile']

@pulumi.input_type
class NetworkProfileArgs:
    def __init__(__self__, *,
                 project_arn: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 downlink_bandwidth_bits: Optional[pulumi.Input[int]] = None,
                 downlink_delay_ms: Optional[pulumi.Input[int]] = None,
                 downlink_jitter_ms: Optional[pulumi.Input[int]] = None,
                 downlink_loss_percent: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uplink_bandwidth_bits: Optional[pulumi.Input[int]] = None,
                 uplink_delay_ms: Optional[pulumi.Input[int]] = None,
                 uplink_jitter_ms: Optional[pulumi.Input[int]] = None,
                 uplink_loss_percent: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a NetworkProfile resource.
        :param pulumi.Input[str] project_arn: The ARN of the project for the network profile.
        :param pulumi.Input[str] description: The description of the network profile.
        :param pulumi.Input[int] downlink_bandwidth_bits: The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        :param pulumi.Input[int] downlink_delay_ms: Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] downlink_jitter_ms: Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] downlink_loss_percent: Proportion of received packets that fail to arrive from `0` to `100` percent.
        :param pulumi.Input[str] name: The name for the network profile.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
        :param pulumi.Input[int] uplink_bandwidth_bits: The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        :param pulumi.Input[int] uplink_delay_ms: Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] uplink_jitter_ms: Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] uplink_loss_percent: Proportion of received packets that fail to arrive from `0` to `100` percent.
        """
        pulumi.set(__self__, "project_arn", project_arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if downlink_bandwidth_bits is not None:
            pulumi.set(__self__, "downlink_bandwidth_bits", downlink_bandwidth_bits)
        if downlink_delay_ms is not None:
            pulumi.set(__self__, "downlink_delay_ms", downlink_delay_ms)
        if downlink_jitter_ms is not None:
            pulumi.set(__self__, "downlink_jitter_ms", downlink_jitter_ms)
        if downlink_loss_percent is not None:
            pulumi.set(__self__, "downlink_loss_percent", downlink_loss_percent)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if uplink_bandwidth_bits is not None:
            pulumi.set(__self__, "uplink_bandwidth_bits", uplink_bandwidth_bits)
        if uplink_delay_ms is not None:
            pulumi.set(__self__, "uplink_delay_ms", uplink_delay_ms)
        if uplink_jitter_ms is not None:
            pulumi.set(__self__, "uplink_jitter_ms", uplink_jitter_ms)
        if uplink_loss_percent is not None:
            pulumi.set(__self__, "uplink_loss_percent", uplink_loss_percent)

    @property
    @pulumi.getter(name="projectArn")
    def project_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the project for the network profile.
        """
        return pulumi.get(self, "project_arn")

    @project_arn.setter
    def project_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the network profile.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="downlinkBandwidthBits")
    def downlink_bandwidth_bits(self) -> Optional[pulumi.Input[int]]:
        """
        The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        """
        return pulumi.get(self, "downlink_bandwidth_bits")

    @downlink_bandwidth_bits.setter
    def downlink_bandwidth_bits(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "downlink_bandwidth_bits", value)

    @property
    @pulumi.getter(name="downlinkDelayMs")
    def downlink_delay_ms(self) -> Optional[pulumi.Input[int]]:
        """
        Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "downlink_delay_ms")

    @downlink_delay_ms.setter
    def downlink_delay_ms(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "downlink_delay_ms", value)

    @property
    @pulumi.getter(name="downlinkJitterMs")
    def downlink_jitter_ms(self) -> Optional[pulumi.Input[int]]:
        """
        Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "downlink_jitter_ms")

    @downlink_jitter_ms.setter
    def downlink_jitter_ms(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "downlink_jitter_ms", value)

    @property
    @pulumi.getter(name="downlinkLossPercent")
    def downlink_loss_percent(self) -> Optional[pulumi.Input[int]]:
        """
        Proportion of received packets that fail to arrive from `0` to `100` percent.
        """
        return pulumi.get(self, "downlink_loss_percent")

    @downlink_loss_percent.setter
    def downlink_loss_percent(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "downlink_loss_percent", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the network profile.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="uplinkBandwidthBits")
    def uplink_bandwidth_bits(self) -> Optional[pulumi.Input[int]]:
        """
        The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        """
        return pulumi.get(self, "uplink_bandwidth_bits")

    @uplink_bandwidth_bits.setter
    def uplink_bandwidth_bits(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "uplink_bandwidth_bits", value)

    @property
    @pulumi.getter(name="uplinkDelayMs")
    def uplink_delay_ms(self) -> Optional[pulumi.Input[int]]:
        """
        Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "uplink_delay_ms")

    @uplink_delay_ms.setter
    def uplink_delay_ms(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "uplink_delay_ms", value)

    @property
    @pulumi.getter(name="uplinkJitterMs")
    def uplink_jitter_ms(self) -> Optional[pulumi.Input[int]]:
        """
        Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "uplink_jitter_ms")

    @uplink_jitter_ms.setter
    def uplink_jitter_ms(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "uplink_jitter_ms", value)

    @property
    @pulumi.getter(name="uplinkLossPercent")
    def uplink_loss_percent(self) -> Optional[pulumi.Input[int]]:
        """
        Proportion of received packets that fail to arrive from `0` to `100` percent.
        """
        return pulumi.get(self, "uplink_loss_percent")

    @uplink_loss_percent.setter
    def uplink_loss_percent(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "uplink_loss_percent", value)


@pulumi.input_type
class _NetworkProfileState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 downlink_bandwidth_bits: Optional[pulumi.Input[int]] = None,
                 downlink_delay_ms: Optional[pulumi.Input[int]] = None,
                 downlink_jitter_ms: Optional[pulumi.Input[int]] = None,
                 downlink_loss_percent: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uplink_bandwidth_bits: Optional[pulumi.Input[int]] = None,
                 uplink_delay_ms: Optional[pulumi.Input[int]] = None,
                 uplink_jitter_ms: Optional[pulumi.Input[int]] = None,
                 uplink_loss_percent: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering NetworkProfile resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name of this network profile.
        :param pulumi.Input[str] description: The description of the network profile.
        :param pulumi.Input[int] downlink_bandwidth_bits: The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        :param pulumi.Input[int] downlink_delay_ms: Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] downlink_jitter_ms: Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] downlink_loss_percent: Proportion of received packets that fail to arrive from `0` to `100` percent.
        :param pulumi.Input[str] name: The name for the network profile.
        :param pulumi.Input[str] project_arn: The ARN of the project for the network profile.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
        :param pulumi.Input[int] uplink_bandwidth_bits: The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        :param pulumi.Input[int] uplink_delay_ms: Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] uplink_jitter_ms: Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] uplink_loss_percent: Proportion of received packets that fail to arrive from `0` to `100` percent.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if downlink_bandwidth_bits is not None:
            pulumi.set(__self__, "downlink_bandwidth_bits", downlink_bandwidth_bits)
        if downlink_delay_ms is not None:
            pulumi.set(__self__, "downlink_delay_ms", downlink_delay_ms)
        if downlink_jitter_ms is not None:
            pulumi.set(__self__, "downlink_jitter_ms", downlink_jitter_ms)
        if downlink_loss_percent is not None:
            pulumi.set(__self__, "downlink_loss_percent", downlink_loss_percent)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_arn is not None:
            pulumi.set(__self__, "project_arn", project_arn)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if uplink_bandwidth_bits is not None:
            pulumi.set(__self__, "uplink_bandwidth_bits", uplink_bandwidth_bits)
        if uplink_delay_ms is not None:
            pulumi.set(__self__, "uplink_delay_ms", uplink_delay_ms)
        if uplink_jitter_ms is not None:
            pulumi.set(__self__, "uplink_jitter_ms", uplink_jitter_ms)
        if uplink_loss_percent is not None:
            pulumi.set(__self__, "uplink_loss_percent", uplink_loss_percent)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name of this network profile.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the network profile.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="downlinkBandwidthBits")
    def downlink_bandwidth_bits(self) -> Optional[pulumi.Input[int]]:
        """
        The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        """
        return pulumi.get(self, "downlink_bandwidth_bits")

    @downlink_bandwidth_bits.setter
    def downlink_bandwidth_bits(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "downlink_bandwidth_bits", value)

    @property
    @pulumi.getter(name="downlinkDelayMs")
    def downlink_delay_ms(self) -> Optional[pulumi.Input[int]]:
        """
        Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "downlink_delay_ms")

    @downlink_delay_ms.setter
    def downlink_delay_ms(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "downlink_delay_ms", value)

    @property
    @pulumi.getter(name="downlinkJitterMs")
    def downlink_jitter_ms(self) -> Optional[pulumi.Input[int]]:
        """
        Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "downlink_jitter_ms")

    @downlink_jitter_ms.setter
    def downlink_jitter_ms(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "downlink_jitter_ms", value)

    @property
    @pulumi.getter(name="downlinkLossPercent")
    def downlink_loss_percent(self) -> Optional[pulumi.Input[int]]:
        """
        Proportion of received packets that fail to arrive from `0` to `100` percent.
        """
        return pulumi.get(self, "downlink_loss_percent")

    @downlink_loss_percent.setter
    def downlink_loss_percent(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "downlink_loss_percent", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the network profile.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="projectArn")
    def project_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the project for the network profile.
        """
        return pulumi.get(self, "project_arn")

    @project_arn.setter
    def project_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_arn", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="uplinkBandwidthBits")
    def uplink_bandwidth_bits(self) -> Optional[pulumi.Input[int]]:
        """
        The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        """
        return pulumi.get(self, "uplink_bandwidth_bits")

    @uplink_bandwidth_bits.setter
    def uplink_bandwidth_bits(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "uplink_bandwidth_bits", value)

    @property
    @pulumi.getter(name="uplinkDelayMs")
    def uplink_delay_ms(self) -> Optional[pulumi.Input[int]]:
        """
        Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "uplink_delay_ms")

    @uplink_delay_ms.setter
    def uplink_delay_ms(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "uplink_delay_ms", value)

    @property
    @pulumi.getter(name="uplinkJitterMs")
    def uplink_jitter_ms(self) -> Optional[pulumi.Input[int]]:
        """
        Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "uplink_jitter_ms")

    @uplink_jitter_ms.setter
    def uplink_jitter_ms(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "uplink_jitter_ms", value)

    @property
    @pulumi.getter(name="uplinkLossPercent")
    def uplink_loss_percent(self) -> Optional[pulumi.Input[int]]:
        """
        Proportion of received packets that fail to arrive from `0` to `100` percent.
        """
        return pulumi.get(self, "uplink_loss_percent")

    @uplink_loss_percent.setter
    def uplink_loss_percent(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "uplink_loss_percent", value)


class NetworkProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 downlink_bandwidth_bits: Optional[pulumi.Input[int]] = None,
                 downlink_delay_ms: Optional[pulumi.Input[int]] = None,
                 downlink_jitter_ms: Optional[pulumi.Input[int]] = None,
                 downlink_loss_percent: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uplink_bandwidth_bits: Optional[pulumi.Input[int]] = None,
                 uplink_delay_ms: Optional[pulumi.Input[int]] = None,
                 uplink_jitter_ms: Optional[pulumi.Input[int]] = None,
                 uplink_loss_percent: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a resource to manage AWS Device Farm Network Profiles.
        ∂
        > **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_project = aws.devicefarm.Project("exampleProject")
        example_network_profile = aws.devicefarm.NetworkProfile("exampleNetworkProfile", project_arn=example_project.arn)
        ```

        ## Import

        Using `pulumi import`, import DeviceFarm Network Profiles using their ARN. For example:

        ```sh
         $ pulumi import aws:devicefarm/networkProfile:NetworkProfile example arn:aws:devicefarm:us-west-2:123456789012:networkprofile:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the network profile.
        :param pulumi.Input[int] downlink_bandwidth_bits: The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        :param pulumi.Input[int] downlink_delay_ms: Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] downlink_jitter_ms: Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] downlink_loss_percent: Proportion of received packets that fail to arrive from `0` to `100` percent.
        :param pulumi.Input[str] name: The name for the network profile.
        :param pulumi.Input[str] project_arn: The ARN of the project for the network profile.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
        :param pulumi.Input[int] uplink_bandwidth_bits: The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        :param pulumi.Input[int] uplink_delay_ms: Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] uplink_jitter_ms: Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] uplink_loss_percent: Proportion of received packets that fail to arrive from `0` to `100` percent.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage AWS Device Farm Network Profiles.
        ∂
        > **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_project = aws.devicefarm.Project("exampleProject")
        example_network_profile = aws.devicefarm.NetworkProfile("exampleNetworkProfile", project_arn=example_project.arn)
        ```

        ## Import

        Using `pulumi import`, import DeviceFarm Network Profiles using their ARN. For example:

        ```sh
         $ pulumi import aws:devicefarm/networkProfile:NetworkProfile example arn:aws:devicefarm:us-west-2:123456789012:networkprofile:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
        ```

        :param str resource_name: The name of the resource.
        :param NetworkProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 downlink_bandwidth_bits: Optional[pulumi.Input[int]] = None,
                 downlink_delay_ms: Optional[pulumi.Input[int]] = None,
                 downlink_jitter_ms: Optional[pulumi.Input[int]] = None,
                 downlink_loss_percent: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uplink_bandwidth_bits: Optional[pulumi.Input[int]] = None,
                 uplink_delay_ms: Optional[pulumi.Input[int]] = None,
                 uplink_jitter_ms: Optional[pulumi.Input[int]] = None,
                 uplink_loss_percent: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkProfileArgs.__new__(NetworkProfileArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["downlink_bandwidth_bits"] = downlink_bandwidth_bits
            __props__.__dict__["downlink_delay_ms"] = downlink_delay_ms
            __props__.__dict__["downlink_jitter_ms"] = downlink_jitter_ms
            __props__.__dict__["downlink_loss_percent"] = downlink_loss_percent
            __props__.__dict__["name"] = name
            if project_arn is None and not opts.urn:
                raise TypeError("Missing required property 'project_arn'")
            __props__.__dict__["project_arn"] = project_arn
            __props__.__dict__["tags"] = tags
            __props__.__dict__["type"] = type
            __props__.__dict__["uplink_bandwidth_bits"] = uplink_bandwidth_bits
            __props__.__dict__["uplink_delay_ms"] = uplink_delay_ms
            __props__.__dict__["uplink_jitter_ms"] = uplink_jitter_ms
            __props__.__dict__["uplink_loss_percent"] = uplink_loss_percent
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(NetworkProfile, __self__).__init__(
            'aws:devicefarm/networkProfile:NetworkProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            downlink_bandwidth_bits: Optional[pulumi.Input[int]] = None,
            downlink_delay_ms: Optional[pulumi.Input[int]] = None,
            downlink_jitter_ms: Optional[pulumi.Input[int]] = None,
            downlink_loss_percent: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_arn: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            uplink_bandwidth_bits: Optional[pulumi.Input[int]] = None,
            uplink_delay_ms: Optional[pulumi.Input[int]] = None,
            uplink_jitter_ms: Optional[pulumi.Input[int]] = None,
            uplink_loss_percent: Optional[pulumi.Input[int]] = None) -> 'NetworkProfile':
        """
        Get an existing NetworkProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name of this network profile.
        :param pulumi.Input[str] description: The description of the network profile.
        :param pulumi.Input[int] downlink_bandwidth_bits: The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        :param pulumi.Input[int] downlink_delay_ms: Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] downlink_jitter_ms: Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] downlink_loss_percent: Proportion of received packets that fail to arrive from `0` to `100` percent.
        :param pulumi.Input[str] name: The name for the network profile.
        :param pulumi.Input[str] project_arn: The ARN of the project for the network profile.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
        :param pulumi.Input[int] uplink_bandwidth_bits: The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        :param pulumi.Input[int] uplink_delay_ms: Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] uplink_jitter_ms: Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        :param pulumi.Input[int] uplink_loss_percent: Proportion of received packets that fail to arrive from `0` to `100` percent.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkProfileState.__new__(_NetworkProfileState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["downlink_bandwidth_bits"] = downlink_bandwidth_bits
        __props__.__dict__["downlink_delay_ms"] = downlink_delay_ms
        __props__.__dict__["downlink_jitter_ms"] = downlink_jitter_ms
        __props__.__dict__["downlink_loss_percent"] = downlink_loss_percent
        __props__.__dict__["name"] = name
        __props__.__dict__["project_arn"] = project_arn
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["type"] = type
        __props__.__dict__["uplink_bandwidth_bits"] = uplink_bandwidth_bits
        __props__.__dict__["uplink_delay_ms"] = uplink_delay_ms
        __props__.__dict__["uplink_jitter_ms"] = uplink_jitter_ms
        __props__.__dict__["uplink_loss_percent"] = uplink_loss_percent
        return NetworkProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name of this network profile.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the network profile.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="downlinkBandwidthBits")
    def downlink_bandwidth_bits(self) -> pulumi.Output[Optional[int]]:
        """
        The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        """
        return pulumi.get(self, "downlink_bandwidth_bits")

    @property
    @pulumi.getter(name="downlinkDelayMs")
    def downlink_delay_ms(self) -> pulumi.Output[Optional[int]]:
        """
        Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "downlink_delay_ms")

    @property
    @pulumi.getter(name="downlinkJitterMs")
    def downlink_jitter_ms(self) -> pulumi.Output[Optional[int]]:
        """
        Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "downlink_jitter_ms")

    @property
    @pulumi.getter(name="downlinkLossPercent")
    def downlink_loss_percent(self) -> pulumi.Output[Optional[int]]:
        """
        Proportion of received packets that fail to arrive from `0` to `100` percent.
        """
        return pulumi.get(self, "downlink_loss_percent")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the network profile.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectArn")
    def project_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the project for the network profile.
        """
        return pulumi.get(self, "project_arn")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="uplinkBandwidthBits")
    def uplink_bandwidth_bits(self) -> pulumi.Output[Optional[int]]:
        """
        The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
        """
        return pulumi.get(self, "uplink_bandwidth_bits")

    @property
    @pulumi.getter(name="uplinkDelayMs")
    def uplink_delay_ms(self) -> pulumi.Output[Optional[int]]:
        """
        Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "uplink_delay_ms")

    @property
    @pulumi.getter(name="uplinkJitterMs")
    def uplink_jitter_ms(self) -> pulumi.Output[Optional[int]]:
        """
        Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
        """
        return pulumi.get(self, "uplink_jitter_ms")

    @property
    @pulumi.getter(name="uplinkLossPercent")
    def uplink_loss_percent(self) -> pulumi.Output[Optional[int]]:
        """
        Proportion of received packets that fail to arrive from `0` to `100` percent.
        """
        return pulumi.get(self, "uplink_loss_percent")

