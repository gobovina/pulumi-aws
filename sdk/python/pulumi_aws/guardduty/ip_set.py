# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['IPSetArgs', 'IPSet']

@pulumi.input_type
class IPSetArgs:
    def __init__(__self__, *,
                 activate: pulumi.Input[bool],
                 detector_id: pulumi.Input[str],
                 format: pulumi.Input[str],
                 location: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a IPSet resource.
        :param pulumi.Input[bool] activate: Specifies whether GuardDuty is to start using the uploaded IPSet.
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty.
        :param pulumi.Input[str] format: The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
        :param pulumi.Input[str] location: The URI of the file that contains the IPSet.
        :param pulumi.Input[str] name: The friendly name to identify the IPSet.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags.
        """
        pulumi.set(__self__, "activate", activate)
        pulumi.set(__self__, "detector_id", detector_id)
        pulumi.set(__self__, "format", format)
        pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def activate(self) -> pulumi.Input[bool]:
        """
        Specifies whether GuardDuty is to start using the uploaded IPSet.
        """
        return pulumi.get(self, "activate")

    @activate.setter
    def activate(self, value: pulumi.Input[bool]):
        pulumi.set(self, "activate", value)

    @property
    @pulumi.getter(name="detectorId")
    def detector_id(self) -> pulumi.Input[str]:
        """
        The detector ID of the GuardDuty.
        """
        return pulumi.get(self, "detector_id")

    @detector_id.setter
    def detector_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "detector_id", value)

    @property
    @pulumi.getter
    def format(self) -> pulumi.Input[str]:
        """
        The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
        """
        return pulumi.get(self, "format")

    @format.setter
    def format(self, value: pulumi.Input[str]):
        pulumi.set(self, "format", value)

    @property
    @pulumi.getter
    def location(self) -> pulumi.Input[str]:
        """
        The URI of the file that contains the IPSet.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[str]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The friendly name to identify the IPSet.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _IPSetState:
    def __init__(__self__, *,
                 activate: Optional[pulumi.Input[bool]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 detector_id: Optional[pulumi.Input[str]] = None,
                 format: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering IPSet resources.
        :param pulumi.Input[bool] activate: Specifies whether GuardDuty is to start using the uploaded IPSet.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the GuardDuty IPSet.
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty.
        :param pulumi.Input[str] format: The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
        :param pulumi.Input[str] location: The URI of the file that contains the IPSet.
        :param pulumi.Input[str] name: The friendly name to identify the IPSet.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags.
        """
        if activate is not None:
            pulumi.set(__self__, "activate", activate)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if detector_id is not None:
            pulumi.set(__self__, "detector_id", detector_id)
        if format is not None:
            pulumi.set(__self__, "format", format)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def activate(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether GuardDuty is to start using the uploaded IPSet.
        """
        return pulumi.get(self, "activate")

    @activate.setter
    def activate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "activate", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the GuardDuty IPSet.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="detectorId")
    def detector_id(self) -> Optional[pulumi.Input[str]]:
        """
        The detector ID of the GuardDuty.
        """
        return pulumi.get(self, "detector_id")

    @detector_id.setter
    def detector_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "detector_id", value)

    @property
    @pulumi.getter
    def format(self) -> Optional[pulumi.Input[str]]:
        """
        The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
        """
        return pulumi.get(self, "format")

    @format.setter
    def format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "format", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The URI of the file that contains the IPSet.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The friendly name to identify the IPSet.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class IPSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 activate: Optional[pulumi.Input[bool]] = None,
                 detector_id: Optional[pulumi.Input[str]] = None,
                 format: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a resource to manage a GuardDuty IPSet.

        > **Note:** Currently in GuardDuty, users from member accounts cannot upload and further manage IPSets. IPSets that are uploaded by the primary account are imposed on GuardDuty functionality in its member accounts. See the [GuardDuty API Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/create-ip-set.html)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        primary = aws.guardduty.Detector("primary", enable=True)
        bucket = aws.s3.Bucket("bucket", acl="private")
        my_ip_set = aws.s3.BucketObject("myIPSet",
            acl="public-read",
            content="10.0.0.0/8\n",
            bucket=bucket.id,
            key="MyIPSet")
        example = aws.guardduty.IPSet("example",
            activate=True,
            detector_id=primary.id,
            format="TXT",
            location=pulumi.Output.all(my_ip_set.bucket, my_ip_set.key).apply(lambda bucket, key: f"https://s3.amazonaws.com/{bucket}/{key}"))
        ```

        ## Import

        GuardDuty IPSet can be imported using the the primary GuardDuty detector ID and IPSet ID, e.g.

        ```sh
         $ pulumi import aws:guardduty/iPSet:IPSet MyIPSet 00b00fd5aecc0ab60a708659477e9617:123456789012
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] activate: Specifies whether GuardDuty is to start using the uploaded IPSet.
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty.
        :param pulumi.Input[str] format: The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
        :param pulumi.Input[str] location: The URI of the file that contains the IPSet.
        :param pulumi.Input[str] name: The friendly name to identify the IPSet.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IPSetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage a GuardDuty IPSet.

        > **Note:** Currently in GuardDuty, users from member accounts cannot upload and further manage IPSets. IPSets that are uploaded by the primary account are imposed on GuardDuty functionality in its member accounts. See the [GuardDuty API Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/create-ip-set.html)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        primary = aws.guardduty.Detector("primary", enable=True)
        bucket = aws.s3.Bucket("bucket", acl="private")
        my_ip_set = aws.s3.BucketObject("myIPSet",
            acl="public-read",
            content="10.0.0.0/8\n",
            bucket=bucket.id,
            key="MyIPSet")
        example = aws.guardduty.IPSet("example",
            activate=True,
            detector_id=primary.id,
            format="TXT",
            location=pulumi.Output.all(my_ip_set.bucket, my_ip_set.key).apply(lambda bucket, key: f"https://s3.amazonaws.com/{bucket}/{key}"))
        ```

        ## Import

        GuardDuty IPSet can be imported using the the primary GuardDuty detector ID and IPSet ID, e.g.

        ```sh
         $ pulumi import aws:guardduty/iPSet:IPSet MyIPSet 00b00fd5aecc0ab60a708659477e9617:123456789012
        ```

        :param str resource_name: The name of the resource.
        :param IPSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IPSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 activate: Optional[pulumi.Input[bool]] = None,
                 detector_id: Optional[pulumi.Input[str]] = None,
                 format: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IPSetArgs.__new__(IPSetArgs)

            if activate is None and not opts.urn:
                raise TypeError("Missing required property 'activate'")
            __props__.__dict__["activate"] = activate
            if detector_id is None and not opts.urn:
                raise TypeError("Missing required property 'detector_id'")
            __props__.__dict__["detector_id"] = detector_id
            if format is None and not opts.urn:
                raise TypeError("Missing required property 'format'")
            __props__.__dict__["format"] = format
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
        super(IPSet, __self__).__init__(
            'aws:guardduty/iPSet:IPSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            activate: Optional[pulumi.Input[bool]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            detector_id: Optional[pulumi.Input[str]] = None,
            format: Optional[pulumi.Input[str]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'IPSet':
        """
        Get an existing IPSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] activate: Specifies whether GuardDuty is to start using the uploaded IPSet.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the GuardDuty IPSet.
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty.
        :param pulumi.Input[str] format: The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
        :param pulumi.Input[str] location: The URI of the file that contains the IPSet.
        :param pulumi.Input[str] name: The friendly name to identify the IPSet.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IPSetState.__new__(_IPSetState)

        __props__.__dict__["activate"] = activate
        __props__.__dict__["arn"] = arn
        __props__.__dict__["detector_id"] = detector_id
        __props__.__dict__["format"] = format
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        return IPSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def activate(self) -> pulumi.Output[bool]:
        """
        Specifies whether GuardDuty is to start using the uploaded IPSet.
        """
        return pulumi.get(self, "activate")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the GuardDuty IPSet.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="detectorId")
    def detector_id(self) -> pulumi.Output[str]:
        """
        The detector ID of the GuardDuty.
        """
        return pulumi.get(self, "detector_id")

    @property
    @pulumi.getter
    def format(self) -> pulumi.Output[str]:
        """
        The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
        """
        return pulumi.get(self, "format")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The URI of the file that contains the IPSet.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The friendly name to identify the IPSet.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags.
        """
        return pulumi.get(self, "tags")

