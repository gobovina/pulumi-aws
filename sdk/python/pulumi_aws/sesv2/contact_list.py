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
from . import outputs
from ._inputs import *

__all__ = ['ContactListArgs', 'ContactList']

@pulumi.input_type
class ContactListArgs:
    def __init__(__self__, *,
                 contact_list_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 topics: Optional[pulumi.Input[Sequence[pulumi.Input['ContactListTopicArgs']]]] = None):
        """
        The set of arguments for constructing a ContactList resource.
        :param pulumi.Input[str] contact_list_name: Name of the contact list.
               
               The following arguments are optional:
        :param pulumi.Input[str] description: Description of what the contact list is about.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags for the contact list. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input['ContactListTopicArgs']]] topics: Configuration block(s) with topic for the contact list. Detailed below.
        """
        pulumi.set(__self__, "contact_list_name", contact_list_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if topics is not None:
            pulumi.set(__self__, "topics", topics)

    @property
    @pulumi.getter(name="contactListName")
    def contact_list_name(self) -> pulumi.Input[str]:
        """
        Name of the contact list.

        The following arguments are optional:
        """
        return pulumi.get(self, "contact_list_name")

    @contact_list_name.setter
    def contact_list_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "contact_list_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of what the contact list is about.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags for the contact list. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def topics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ContactListTopicArgs']]]]:
        """
        Configuration block(s) with topic for the contact list. Detailed below.
        """
        return pulumi.get(self, "topics")

    @topics.setter
    def topics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ContactListTopicArgs']]]]):
        pulumi.set(self, "topics", value)


@pulumi.input_type
class _ContactListState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 contact_list_name: Optional[pulumi.Input[str]] = None,
                 created_timestamp: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 last_updated_timestamp: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 topics: Optional[pulumi.Input[Sequence[pulumi.Input['ContactListTopicArgs']]]] = None):
        """
        Input properties used for looking up and filtering ContactList resources.
        :param pulumi.Input[str] contact_list_name: Name of the contact list.
               
               The following arguments are optional:
        :param pulumi.Input[str] created_timestamp: Timestamp noting when the contact list was created in ISO 8601 format.
        :param pulumi.Input[str] description: Description of what the contact list is about.
        :param pulumi.Input[str] last_updated_timestamp: Timestamp noting the last time the contact list was updated in ISO 8601 format.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags for the contact list. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input['ContactListTopicArgs']]] topics: Configuration block(s) with topic for the contact list. Detailed below.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if contact_list_name is not None:
            pulumi.set(__self__, "contact_list_name", contact_list_name)
        if created_timestamp is not None:
            pulumi.set(__self__, "created_timestamp", created_timestamp)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if last_updated_timestamp is not None:
            pulumi.set(__self__, "last_updated_timestamp", last_updated_timestamp)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if topics is not None:
            pulumi.set(__self__, "topics", topics)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="contactListName")
    def contact_list_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the contact list.

        The following arguments are optional:
        """
        return pulumi.get(self, "contact_list_name")

    @contact_list_name.setter
    def contact_list_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "contact_list_name", value)

    @property
    @pulumi.getter(name="createdTimestamp")
    def created_timestamp(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp noting when the contact list was created in ISO 8601 format.
        """
        return pulumi.get(self, "created_timestamp")

    @created_timestamp.setter
    def created_timestamp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_timestamp", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of what the contact list is about.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="lastUpdatedTimestamp")
    def last_updated_timestamp(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp noting the last time the contact list was updated in ISO 8601 format.
        """
        return pulumi.get(self, "last_updated_timestamp")

    @last_updated_timestamp.setter
    def last_updated_timestamp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_updated_timestamp", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags for the contact list. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def topics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ContactListTopicArgs']]]]:
        """
        Configuration block(s) with topic for the contact list. Detailed below.
        """
        return pulumi.get(self, "topics")

    @topics.setter
    def topics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ContactListTopicArgs']]]]):
        pulumi.set(self, "topics", value)


class ContactList(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_list_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 topics: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ContactListTopicArgs', 'ContactListTopicArgsDict']]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS SESv2 (Simple Email V2) Contact List.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ContactList("example", contact_list_name="example")
        ```

        ### Extended Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ContactList("example",
            contact_list_name="example",
            description="description",
            topics=[{
                "defaultSubscriptionStatus": "OPT_IN",
                "description": "topic description",
                "displayName": "Example Topic",
                "topicName": "example-topic",
            }])
        ```

        ## Import

        Using `pulumi import`, import SESv2 (Simple Email V2) Contact List using the `id`. For example:

        ```sh
        $ pulumi import aws:sesv2/contactList:ContactList example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] contact_list_name: Name of the contact list.
               
               The following arguments are optional:
        :param pulumi.Input[str] description: Description of what the contact list is about.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags for the contact list. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ContactListTopicArgs', 'ContactListTopicArgsDict']]]] topics: Configuration block(s) with topic for the contact list. Detailed below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ContactListArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS SESv2 (Simple Email V2) Contact List.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ContactList("example", contact_list_name="example")
        ```

        ### Extended Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ContactList("example",
            contact_list_name="example",
            description="description",
            topics=[{
                "defaultSubscriptionStatus": "OPT_IN",
                "description": "topic description",
                "displayName": "Example Topic",
                "topicName": "example-topic",
            }])
        ```

        ## Import

        Using `pulumi import`, import SESv2 (Simple Email V2) Contact List using the `id`. For example:

        ```sh
        $ pulumi import aws:sesv2/contactList:ContactList example example
        ```

        :param str resource_name: The name of the resource.
        :param ContactListArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ContactListArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_list_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 topics: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ContactListTopicArgs', 'ContactListTopicArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ContactListArgs.__new__(ContactListArgs)

            if contact_list_name is None and not opts.urn:
                raise TypeError("Missing required property 'contact_list_name'")
            __props__.__dict__["contact_list_name"] = contact_list_name
            __props__.__dict__["description"] = description
            __props__.__dict__["tags"] = tags
            __props__.__dict__["topics"] = topics
            __props__.__dict__["arn"] = None
            __props__.__dict__["created_timestamp"] = None
            __props__.__dict__["last_updated_timestamp"] = None
            __props__.__dict__["tags_all"] = None
        super(ContactList, __self__).__init__(
            'aws:sesv2/contactList:ContactList',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            contact_list_name: Optional[pulumi.Input[str]] = None,
            created_timestamp: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            last_updated_timestamp: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            topics: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ContactListTopicArgs', 'ContactListTopicArgsDict']]]]] = None) -> 'ContactList':
        """
        Get an existing ContactList resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] contact_list_name: Name of the contact list.
               
               The following arguments are optional:
        :param pulumi.Input[str] created_timestamp: Timestamp noting when the contact list was created in ISO 8601 format.
        :param pulumi.Input[str] description: Description of what the contact list is about.
        :param pulumi.Input[str] last_updated_timestamp: Timestamp noting the last time the contact list was updated in ISO 8601 format.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags for the contact list. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ContactListTopicArgs', 'ContactListTopicArgsDict']]]] topics: Configuration block(s) with topic for the contact list. Detailed below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ContactListState.__new__(_ContactListState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["contact_list_name"] = contact_list_name
        __props__.__dict__["created_timestamp"] = created_timestamp
        __props__.__dict__["description"] = description
        __props__.__dict__["last_updated_timestamp"] = last_updated_timestamp
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["topics"] = topics
        return ContactList(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="contactListName")
    def contact_list_name(self) -> pulumi.Output[str]:
        """
        Name of the contact list.

        The following arguments are optional:
        """
        return pulumi.get(self, "contact_list_name")

    @property
    @pulumi.getter(name="createdTimestamp")
    def created_timestamp(self) -> pulumi.Output[str]:
        """
        Timestamp noting when the contact list was created in ISO 8601 format.
        """
        return pulumi.get(self, "created_timestamp")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of what the contact list is about.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="lastUpdatedTimestamp")
    def last_updated_timestamp(self) -> pulumi.Output[str]:
        """
        Timestamp noting the last time the contact list was updated in ISO 8601 format.
        """
        return pulumi.get(self, "last_updated_timestamp")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags for the contact list. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def topics(self) -> pulumi.Output[Optional[Sequence['outputs.ContactListTopic']]]:
        """
        Configuration block(s) with topic for the contact list. Detailed below.
        """
        return pulumi.get(self, "topics")

